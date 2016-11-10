package com.sergeyloginov.multiselectionplaylist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.util.SortedList;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.util.SortedListAdapterCallback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFragment extends Fragment {

    private static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    public static final int STATE_ALL_SONGS = 0;
    public static final int STATE_FAVOURITE = 1;
    private int state;
    public SongAdapter adapter;

    static PageFragment newInstance(int page) {
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
        if (pageNumber == 0) {
            state = STATE_ALL_SONGS;
            adapter = new SongAdapter(state);
            Playlist playlist = new Playlist(getActivity());
            for (Song song : playlist.getSongs()) {
                adapter.addSong(song);
            }
        } else {
            state = STATE_FAVOURITE;
            adapter = new SongAdapter(state);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        DefaultItemAnimator animator = new DefaultItemAnimator();
        animator.setAddDuration(800);
        animator.setRemoveDuration(200);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);
        rv.setItemAnimator(animator);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(adapter);
        return view;
    }

    public void replaceSong(Song deleted) {
        adapter.addSong(deleted);
    }

    private class SongHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView ivThumbnail;
        private TextView tvTitle;
        private TextView tvArtist;
        private TextView tvDuration;

        SongHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvArtist = (TextView) itemView.findViewById(R.id.tvArtist);
            tvDuration = (TextView) itemView.findViewById(R.id.tvDuration);
        }

        void bind(Song song) {
            ivThumbnail.setImageResource(song.getThumbnail());
            tvTitle.setText(song.getTitle());
            tvArtist.setText(song.getArtist());
            tvDuration.setText(song.getDuration());
        }

        @Override
        public void onClick(View view) {
            Song deleted = adapter.getSongs().get(getAdapterPosition());
            adapter.removeSong(getAdapterPosition());
            ((MainActivity) getActivity()).addSongToAnotherList(state, deleted);
        }
    }

    private class SongAdapter extends RecyclerView.Adapter<SongHolder> {

        private SortedList<Song> songs;

        SongAdapter(final int state) {
            songs = new SortedList<>(Song.class, new SortedListAdapterCallback<Song>(this) {
                @Override
                public int compare(Song o1, Song o2) {
                    if (state == STATE_ALL_SONGS) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    } else {
                        return -1;
                    }
                }

                @Override
                public boolean areContentsTheSame(Song oldItem, Song newItem) {
                    return false;
                }

                @Override
                public boolean areItemsTheSame(Song item1, Song item2) {
                    return false;
                }
            });
        }

        @Override
        public SongHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View view = inflater.inflate(R.layout.song, parent, false);
            return new SongHolder(view);
        }

        @Override
        public void onBindViewHolder(SongHolder holder, int position) {
            Song song = songs.get(position);
            holder.bind(song);
        }

        @Override
        public int getItemCount() {
            return songs.size();
        }

        void addSong(Song song) {
            songs.add(song);
        }

        void removeSong(int position) {
            songs.removeItemAt(position);
        }

        SortedList<Song> getSongs() {
            return songs;
        }
    }
}
