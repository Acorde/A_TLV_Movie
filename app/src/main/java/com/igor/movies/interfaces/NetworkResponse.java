package com.igor.movies.interfaces;

public interface NetworkResponse<T> {


    void onSuccess(T data);

    void onFailure(T data);

}
