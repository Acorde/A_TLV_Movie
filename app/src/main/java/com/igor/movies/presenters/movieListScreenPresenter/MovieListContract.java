package com.igor.movies.presenters.movieListScreenOresenter;


import com.igor.movies.ui.BaseView;
import com.igor.movies.presenters.BaseMVPPresenter;

public interface MovieListContract {

    interface Presenter extends BaseMVPPresenter<View> {
        void onCreate();

        void onStart();

        void onResume();

        void onPause();

        void onStop();
    }


    interface View extends BaseView {
        void viewInit();
        void setPresenter();
    }
}
