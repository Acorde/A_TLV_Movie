package com.igor.movies.presenters;

import com.igor.movies.ui.BaseView;

public class BasePresenter<V extends BaseView> implements BaseMVPPresenter<V>{

    private V mView;

    @Override
    public void attach(V view) {
        this.mView = view;
    }

    @Override
    public void detach() {
        this.mView = null;
    }

    @Override
    public boolean isAttached() {
        return mView != null;
    }

    public V getmView() {
        return mView;
    }
}
