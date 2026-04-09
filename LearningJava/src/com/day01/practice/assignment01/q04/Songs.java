package com.day01.practice.assignment01.q04;

import java.util.Set;

public class Songs {
    int serialno;
    String title;
    Set<String> artists;
    int releaseYear;
    double rating;

    public Songs(int serialno, String title, Set<String> artists, int releaseYear, double rating) {
        this.serialno = serialno;
        this.title = title;
        this.artists = artists;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getArtists() {
        return artists;
    }

    public void setArtists(Set<String> artists) {
        this.artists = artists;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "serialno=" + serialno +
                ", title='" + title + '\'' +
                ", artists=" + artists +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                '}';
    }
}
