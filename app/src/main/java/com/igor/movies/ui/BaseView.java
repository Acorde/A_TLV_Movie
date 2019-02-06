package com.igor.movies.ui;

import android.content.Context;
import android.view.View;

public interface BaseView {

    Context getContext();

    Context getActivityContext();

    View getView();
}
