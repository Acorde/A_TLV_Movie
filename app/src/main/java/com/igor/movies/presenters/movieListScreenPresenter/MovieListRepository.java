package com.igor.movies.presenters.movieListScreenPresenter;

import android.util.Log;
import com.igor.movies.interfaces.NetworkResponse;
import com.igor.movies.modules.MoviesReply;
import com.igor.movies.networking.RestClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MovieListRepository {

    private static MovieListRepository instance;


    private MovieListRepository() {
    }


    public static MovieListRepository getInstance() {

        if (instance == null) {
            instance = new MovieListRepository();
        }

        return instance;
    }


    public void getMovies(final NetworkResponse callback) {
        Call<MoviesReply> call = RestClient.movieAPI.getNowPlayingMovies(RestClient.API_KEY, "en", "1");

        call.enqueue(new Callback<MoviesReply>() {
            @Override
            public void onResponse(Call<MoviesReply> call, Response<MoviesReply> response) {

                callback.onSuccess(response.body().getResults());
            }

            @Override
            public void onFailure(Call<MoviesReply> call, Throwable t) {
                Log.d("cs", "si");
            }
        });


    }


}
