package com.example.movienightplanner;

import android.media.Image;

public class Movie {

    private String movieID;
    private String movieName;
    private int movieYear;
    private String moviePosterPath;

    public Movie(String movieID, String movieName, int movieYear, String moviePosterPath) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.moviePosterPath = moviePosterPath;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public String getMoviePosterPath() {
        return moviePosterPath;
    }

    public void setMoviePosterPath(String moviePosterPath) {
        this.moviePosterPath = moviePosterPath;
    }
}
