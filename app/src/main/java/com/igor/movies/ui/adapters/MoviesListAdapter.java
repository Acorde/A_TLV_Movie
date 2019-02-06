package com.igor.movies.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.igor.movies.R;
import com.igor.movies.interfaces.OnAdapterItemClicked;
import com.igor.movies.modules.Movie;

import java.net.URI;
import java.util.ArrayList;

public class MoviesListAdapter extends RecyclerView.Adapter<MoviesListAdapter.ViewHolder> {

    private ArrayList<Movie> movieArrayList;
    private Context context;
    private View mView;
    private OnAdapterItemClicked onAdapterItemClicked;


    public MoviesListAdapter(ArrayList<Movie> movies, Context context, OnAdapterItemClicked listener) {
        this.movieArrayList = movies;
        this.context = context;
        onAdapterItemClicked = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        mView = LayoutInflater.from(context).inflate(R.layout.single_movie_item, viewGroup, false);


        return new ViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.bindView(movieArrayList.get(i));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAdapterItemClicked.OnItemClicked(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.movieArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView single_item_image;

        private TextView single_item_title_TV;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            single_item_title_TV = itemView.findViewById(R.id.single_item_title_TV);
            single_item_image = itemView.findViewById(R.id.single_item_image);

        }

        protected void bindView(Movie movie) {
            single_item_title_TV.setText(movie.getTitle());

            Glide.with(context)
                    .load("https://image.tmdb.org/t/p/original" + movie.getPosterPath())
                    .into(single_item_image);
        }
    }


}
