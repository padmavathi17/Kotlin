package com.practiceexamples.retrofitjava.Repository;

import com.example.ElectionsPojo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by padmavathi.majjuri on Apiinterface
 */
public interface ApiInterface
{
    @GET("/api/unknown")
    Call<ElectionsPojo> doGetListResources();
}
