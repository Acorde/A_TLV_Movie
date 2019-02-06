package com.igor.movies.networking;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class RestClient {

    public static final String API_KEY = "38ae1cfb88c642715550d4c136004a07";
    private static final String BASE_URL = "https://api.themoviedb.org/";
    private static final short TIME_OUT = 15000;


    private static OkHttpClient client = new OkHttpClient.Builder().connectTimeout(TIME_OUT, TimeUnit.MILLISECONDS).build();


    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build();

    public static MovieAPI movieAPI = retrofit.create(MovieAPI.class);


}
