package com.sergeyloginov.multiselectionplaylist;

import android.content.Context;

import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs;

    public Playlist(Context context) {
        songs = new ArrayList<>();
        songs.add(new Song(R.drawable.above_and_beyond_all_over_the_world_4_35,
                context.getResources().getString(R.string.all_over_the_world),
                context.getResources().getString(R.string.above_and_beyond),
                context.getResources().getString(R.string.dur_04_35)));
        songs.add(new Song(R.drawable.audioslave_show_me_how_to_live_4_37,
                context.getResources().getString(R.string.show_me_how_to_live),
                context.getResources().getString(R.string.audioslave),
                context.getResources().getString(R.string.dur_04_37)));
        songs.add(new Song(R.drawable.bon_jovi_wanted_dead_or_alive_5_08,
                context.getResources().getString(R.string.wanted_dead_or_alive),
                context.getResources().getString(R.string.bon_jovi),
                context.getResources().getString(R.string.dur_05_08)));
        songs.add(new Song(R.drawable.dmx_x_gon_give_it_to_ya_3_37,
                context.getResources().getString(R.string.x_gon_give_it_to_ya),
                context.getResources().getString(R.string.dmx),
                context.getResources().getString(R.string.dur_03_37)));
        songs.add(new Song(R.drawable.eric_clapton_old_love_6_24,
                context.getResources().getString(R.string.old_love),
                context.getResources().getString(R.string.eric_clapton),
                context.getResources().getString(R.string.dur_06_24)));
        songs.add(new Song(R.drawable.guns_n_roses_estranged_9_23,
                context.getResources().getString(R.string.estranged),
                context.getResources().getString(R.string.guns_n_roses),
                context.getResources().getString(R.string.dur_09_23)));
        songs.add(new Song(R.drawable.haddaway_what_is_love_4_30,
                context.getResources().getString(R.string.what_is_love),
                context.getResources().getString(R.string.haddaway),
                context.getResources().getString(R.string.dur_04_30)));
        songs.add(new Song(R.drawable.jamie_n_commons_dont_you_know_3_05,
                context.getResources().getString(R.string.dont_you_know),
                context.getResources().getString(R.string.jamie_n_commons),
                context.getResources().getString(R.string.dur_03_05)));
        songs.add(new Song(R.drawable.joe_bonamassa_sloe_gin_8_11,
                context.getResources().getString(R.string.sloe_gin),
                context.getResources().getString(R.string.joe_bonamassa),
                context.getResources().getString(R.string.dur_08_11)));
        songs.add(new Song(R.drawable.joe_cocker_my_fathers_son_4_29,
                context.getResources().getString(R.string.my_fathers_son),
                context.getResources().getString(R.string.joe_cocker),
                context.getResources().getString(R.string.dur_04_29)));
        songs.add(new Song(R.drawable.kaleo_hot_blood_3_38,
                context.getResources().getString(R.string.hot_blood),
                context.getResources().getString(R.string.kaleo),
                context.getResources().getString(R.string.dur_03_38)));
        songs.add(new Song(R.drawable.marilyn_manson_nobodies_3_35,
                context.getResources().getString(R.string.nobodies),
                context.getResources().getString(R.string.marilyn_manson),
                context.getResources().getString(R.string.dur_03_35)));
        songs.add(new Song(R.drawable.nickelback_do_this_anymore_4_03,
                context.getResources().getString(R.string.do_this_anymore),
                context.getResources().getString(R.string.nickelback),
                context.getResources().getString(R.string.dur_04_03)));
        songs.add(new Song(R.drawable.onerepublic_a_i_5_09,
                context.getResources().getString(R.string.a_i),
                context.getResources().getString(R.string.onerepublic),
                context.getResources().getString(R.string.dur_05_09)));
        songs.add(new Song(R.drawable.richie_kotzen_love_is_blind_5_36,
                context.getResources().getString(R.string.love_is_blind),
                context.getResources().getString(R.string.richie_kotzen),
                context.getResources().getString(R.string.dur_05_36)));
        songs.add(new Song(R.drawable.roxette_it_must_have_been_love_4_20,
                context.getResources().getString(R.string.it_must_have_been_love),
                context.getResources().getString(R.string.roxette),
                context.getResources().getString(R.string.dur_04_20)));
        songs.add(new Song(R.drawable.sia_unstoppable_3_37,
                context.getResources().getString(R.string.unstoppable),
                context.getResources().getString(R.string.sia),
                context.getResources().getString(R.string.dur_03_37)));
        songs.add(new Song(R.drawable.skye_ross_the_point_of_no_return_6_29,
                context.getResources().getString(R.string.the_point_of_no_return),
                context.getResources().getString(R.string.skye_ross),
                context.getResources().getString(R.string.dur_06_29)));
        songs.add(new Song(R.drawable.the_infinity_room_room_3_6_18,
                context.getResources().getString(R.string.room_3),
                context.getResources().getString(R.string.the_infinity_room),
                context.getResources().getString(R.string.dur_06_18)));
        songs.add(new Song(R.drawable.u2_stuck_in_a_moment_you_cant_get_out_of_4_33,
                context.getResources().getString(R.string.stuck_in_a_moment),
                context.getResources().getString(R.string.u2),
                context.getResources().getString(R.string.dur_04_33)));
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
