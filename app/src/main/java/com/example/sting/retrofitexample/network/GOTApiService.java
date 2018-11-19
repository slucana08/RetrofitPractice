package com.example.sting.retrofitexample.network;


import com.example.sting.retrofitexample.model.GOTEpisode;
import com.example.sting.retrofitexample.model.GOTResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GOTApiService {
    @GET("?t=Game%20of%20Thrones&Season=1&")
    Call<GOTResponse> getGOTSeason1(@Query("apikey") String apiKey);

    @GET("?t=Game%20of%20Thrones&Season=1&")
    Call<GOTEpisode> getGOTEpisode1(@Query("Episode") int Episode,
                                    @Query ("apikey") String apiKey);
}
