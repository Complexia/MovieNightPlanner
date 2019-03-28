package com.example.movienightplanner;


import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class  Factory {

    private static ArrayList<Movie> movies = new ArrayList<Movie>();
    private static ArrayList<Event> events = new ArrayList<Event>();





    public static ArrayList<Movie> getMovies(){
        return movies;
    }
    public static ArrayList getEvents(){
        return events;
    }
    public static void addMovie(String movieId, String movieName, int movieYear, String moviePosterPath){
        movies.add(new Movie(movieId,movieName,movieYear,moviePosterPath));
    }

}
