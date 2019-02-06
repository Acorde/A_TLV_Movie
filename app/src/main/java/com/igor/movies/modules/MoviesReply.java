package com.igor.movies.modules;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesReply {

    @SerializedName("maximum")
    private String maximum;

    @SerializedName("minimum")
    private String minimum;

    @SerializedName("results")
    private List<Movie> results;


    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
