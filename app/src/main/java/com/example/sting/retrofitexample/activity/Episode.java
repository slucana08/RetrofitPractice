package com.example.sting.retrofitexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.sting.retrofitexample.R;

public class Episode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode);
        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String year = intent.getStringExtra("year");
        String runtime = intent.getStringExtra("runtime");
        String genre = intent.getStringExtra("genre");
        String actors = intent.getStringExtra("actors");
        String plot = intent.getStringExtra("plot");
        int season = intent.getIntExtra("season", 0);
        int episodeNumber = intent.getIntExtra("episodeNumber", 0);


        TextView titleText = findViewById(R.id.episodeTitle_TextView);
        titleText.setText(title);
        TextView yearText = findViewById(R.id.episodeYear_TextView);
        yearText.setText(year);
        TextView runtimeText = findViewById(R.id.episodeRuntime_TextView);
        runtimeText.setText(runtime);
        TextView genreText = findViewById(R.id.episodeGenre_TextView);
        genreText.setText(genre);
        TextView actorsText = findViewById(R.id.episodeActors_TextView);
        actorsText.setText(actors);
        TextView plotText = findViewById(R.id.episodePlot_TextView);
        plotText.setText(plot);
        TextView seasonText = findViewById(R.id.episodeSeason_TextView);
        seasonText.setText(String.valueOf(season));
        TextView episodeNumberText = findViewById(R.id.episodeNumber_TextView);
        episodeNumberText.setText(String.valueOf(episodeNumber));

    }
}


