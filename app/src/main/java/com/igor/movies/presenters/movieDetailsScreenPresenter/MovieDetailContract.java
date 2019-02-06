package com.igor.movies.presenters.movieDetailsScreenPresenter;

import com.igor.movies.presenters.BaseMVPPresenter;
import com.igor.movies.ui.BaseView;

public interface MovieDetailContract {


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
