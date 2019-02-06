package com.igor.movies.networking;


import com.google.gson.annotations.SerializedName;

import com.igor.movies.modules.MoviesReply;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;




public interface MovieAPI {

    @SerializedName("results")
    @GET("3/movie/now_playing")
    Call<MoviesReply> getNowPlayingMovies(@Query("api_key") String apiKey, @Query("language") String language, @Query("page") String page);
}
