package com.example.movienightplanner;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MovieLoader {

    private String movieId = "";
    private String movieName = "";
    private int movieYear = 0;
    private String moviePosterPath = "";

    private Context mContext;
    public MovieLoader(Context mContext){
        this.mContext = mContext;
    }
    public void populateMovies(){






        try{

            InputStream is = mContext.getAssets().open("movies.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;

            while((line = reader.readLine()) != null){

                if(!line.startsWith("//")) {


                    String[] splitLine = line.split(",");
                    splitLine[0] = splitLine[0].replaceAll("\\p{P}", "");
                    movieId = splitLine[0];
                    splitLine[1] = splitLine[1].replaceAll("\\p{P}", "");
                    movieName = splitLine[1];
                    splitLine[2] = splitLine[2].replaceAll("\"", "");
                    
                    movieYear = Integer.parseInt(splitLine[2].trim());
                    moviePosterPath = splitLine[3];
                    Factory.addMovie(movieId,movieName,movieYear,moviePosterPath);

                }

            }

            String msg = Integer.toString(Factory.getMovies().size());
            Log.v("ANANA", msg);


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
