package com.igor.movies.ui.fragments;

import android.content.Context;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.igor.movies.R;
import com.igor.movies.presenters.movieDetailsScreenPresenter.MovieDetailContract;
import com.igor.movies.presenters.movieDetailsScreenPresenter.MovieDetailPresenter;


public class MovieDetailFragment extends BaseFragment implements MovieDetailContract.View {

    @BindView(R.id.movie_title)
    TextView movie_title;
    @BindView(R.id.release_value_TV)
    TextView release_value_TV;
    @BindView(R.id.content_TV)
    TextView content_TV;
    @BindView(R.id.backgroung_image_TV)
    ImageView backgroung_image_TV;
    @BindView(R.id.movie_small_image)
    ImageView movie_small_image;
    @BindView(R.id.play_movie_BTN)
    Button play_movie_BTN;

    private MovieDetailPresenter presenter;


    public MovieDetailFragment() {
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
        mView = inflater.inflate(R.layout.fragment_movie_detail, container, false);

        ButterKnife.bind(this, mView);


        return mView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    @Override
    public void viewInit() {

    }

    @Override
    public void setPresenter() {

        presenter = new MovieDetailPresenter();
        presenter.attach(this);
    }

    @Override
    public Context getActivityContext() {
        return null;
    }
}
