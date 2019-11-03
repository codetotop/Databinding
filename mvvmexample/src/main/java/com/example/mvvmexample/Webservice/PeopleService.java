package com.example.mvvmexample.Webservice;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface PeopleService {

  @GET("/")
  Observable<PeopleResponse> fetchPeople(@Query("results") int numberResult, @Query("nat") String position);
}
