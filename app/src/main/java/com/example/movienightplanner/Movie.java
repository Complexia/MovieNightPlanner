package com.example.movienightplanner;

import android.media.Image;

public class Movie {

    private String movieID;
    private String movieName;
    private int movieYear;
    private Image moviePoster;

    public Movie(String movieID, String movieName, int movieYear, Image moviePoster) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.moviePoster = moviePoster;
    }
}
