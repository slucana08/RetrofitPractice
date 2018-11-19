package com.example.sting.retrofitexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.sting.retrofitexample.R;
import com.example.sting.retrofitexample.adapter.GOTSeasonAdapter;
import com.example.sting.retrofitexample.model.GOTResponse;
import com.example.sting.retrofitexample.model.GOTSeason1;
import com.example.sting.retrofitexample.network.GOTApiService;
import com.example.sting.retrofitexample.network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Retrofit extends AppCompatActivity {

    private static final String TAG = Retrofit.class.getSimpleName();
    private RecyclerView recyclerView = null;

    // insert your themoviedb.org API KEY here
    private final static String API_KEY = "a946379a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        connectAndGetApiData();
    }

    // This method create an instance of Retrofit
    // set the base url
    public void connectAndGetApiData(){
        GOTApiService GOTApiService = RetrofitInstance.getRetrofitInstance()
                .create(com.example.sting.retrofitexample.network.GOTApiService.class);
        Call<GOTResponse> call = GOTApiService.getGOTSeason1(API_KEY);
        call.enqueue(new Callback<GOTResponse>() {
            @Override
            public void onResponse(Call<GOTResponse> call, Response<GOTResponse> response) {
                List<GOTSeason1> episodes = response.body().getEpisodes();
                recyclerView.setAdapter(new GOTSeasonAdapter(episodes,R.layout.list_item_episodes,getApplicationContext()));
                Log.d(TAG, "Number of movies received: " + episodes.size());
            }
            @Override
            public void onFailure(Call<GOTResponse> call, Throwable throwable) {
                Log.e(TAG, throwable.toString());
            }
        });
    }
}

