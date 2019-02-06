package com.igor.movies.presenters.movieListScreenPresenter;


import android.support.v7.widget.RecyclerView;
import com.igor.movies.modules.Movie;
import com.igor.movies.ui.BaseView;
import com.igor.movies.presenters.BaseMVPPresenter;

import java.util.ArrayList;
import java.util.List;

public interface MovieListContract {

    interface Presenter extends BaseMVPPresenter<View> {
        void onCreate();

        void onStart();

        void onResume();

        void onPause();

        void onStop();

        void setRecyclerView(RecyclerView recyclerView);

        void setRecyclerViewAdapter(ArrayList<Movie> moviesList);

        void getDataFromServer();
    }


    interface View extends BaseView {
        void viewInit();

        void setPresenter();

    }
}
