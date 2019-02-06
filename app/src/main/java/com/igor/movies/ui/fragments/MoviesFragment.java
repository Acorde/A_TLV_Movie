package com.igor.movies.ui.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.igor.movies.R;
import com.igor.movies.presenters.movieListScreenPresenter.MovieListPresenter;
import com.igor.movies.presenters.movieListScreenPresenter.MovieListContract;


public class MoviesFragment extends BaseFragment implements MovieListContract.View {

    @BindView(R.id.movie_list_RecyclerView)
    RecyclerView movie_list_RecyclerView;
    @BindView(R.id.movie_list_WTRL)
    SwipeRefreshLayout movie_list_WTRL;

    MovieListPresenter presenter;

    public MoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_movies, container, false);
        ButterKnife.bind(this, mView);
        setPresenter();

        return mView;
    }

    @Override
    public void viewInit() {

    }

    @Override
    public void setPresenter() {
        presenter = new MovieListPresenter();
        presenter.attach(this);
        presenter.setRecyclerView(movie_list_RecyclerView);
    }

    @Override
    public Context getActivityContext() {
        return getContext();
    }

    @Nullable
    @Override
    public Context getContext() {
        return super.getContext();
    }
}
