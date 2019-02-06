package com.igor.movies.presenters.movieListScreenPresenter;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.igor.movies.interfaces.NetworkResponse;
import com.igor.movies.interfaces.OnAdapterItemClicked;
import com.igor.movies.modules.Movie;
import com.igor.movies.presenters.BasePresenter;
import com.igor.movies.ui.adapters.MoviesListAdapter;


import java.util.ArrayList;

public class MovieListPresenter extends BasePresenter<MovieListContract.View> implements MovieListContract.Presenter, OnAdapterItemClicked {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MoviesListAdapter adapter;
    private ArrayList<Movie> movieArrayList;


    public MovieListPresenter() {
        getDataFromServer();
    }


    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        this.layoutManager = new LinearLayoutManager(getmView().getContext(), LinearLayoutManager.VERTICAL, false);

        this.recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void setRecyclerViewAdapter(ArrayList<Movie> moviesList) {
        if (adapter == null) {
            adapter = new MoviesListAdapter(moviesList, getmView().getContext(), this);
        }

        recyclerView.setAdapter(adapter);

    }

    @Override
    public void getDataFromServer() {

        MovieListRepository.getInstance().getMovies(new NetworkResponse() {
            @Override
            public void onSuccess(Object data) {
                setRecyclerViewAdapter((ArrayList<Movie>) data);
            }

            @Override
            public void onFailure(Object data) {

            }
        });
    }


    @Override
    public void OnItemClicked(int pos) {

    }
}
