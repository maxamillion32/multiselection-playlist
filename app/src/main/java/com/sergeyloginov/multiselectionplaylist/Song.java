package com.sergeyloginov.multiselectionplaylist;

public class Song {

    private int thumbnail;
    private String title;
    private String artist;
    private String duration;

    Song(int thumbnail, String title, String artist, String duration) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    int getThumbnail() {
        return thumbnail;
    }

    String getTitle() {
        return title;
    }

    String getArtist() {
        return artist;
    }

    String getDuration() {
        return duration;
    }
}
