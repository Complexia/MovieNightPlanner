package com.example.movienightplanner;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SelectMovieActivity extends AppCompatActivity {

    private LayoutInflater inflater;
    private Button movieIcon;
    private LinearLayout scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_movie);
        inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        scrollView = findViewById(R.id.linearLayout);

        movieIcon = (Button)inflater.inflate(R.layout.movie_buttons,null);
        MovieLoader movieLoader = new MovieLoader(this);
        movieLoader.populateMovies();


        movieIcon.setText(Factory.getMovies().get(0).getMovieName());


        scrollView.addView(movieIcon);



    }
}
