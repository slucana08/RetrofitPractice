package com.example.sting.retrofitexample.network;

import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static retrofit2.Retrofit retrofit;
    private static final String BASE_URL = "http://www.omdbapi.com/";

    public static retrofit2.Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
