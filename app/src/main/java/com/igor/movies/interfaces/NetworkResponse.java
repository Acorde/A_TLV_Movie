package com.igor.movies.interfaces;

public interface NetworkCallback<T> {


    void onSuccess(T data);

    void onFailure(T data);

}
