package com.practiceexamples.retrofitjava.Repository;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by padmavathi.majjuri Retrofit Client
 */
public class ApiClient
{
    private static Retrofit retrofit = null;

    /*
    * Hinting the baseUrl
    * Returns retrofit obj
    *
    * OkHttp Interceptors
    *
        Interceptors are a powerful mechanism present in OkHttp that can monitor, rewrite, and retry calls.
        Interceptors can be majorly divided into two categories:

        Application Interceptors : To register an application interceptor, we need to call addInterceptor() on OkHttpClient.Builder
        Network Interceptors : To register a Network Interceptor, invoke addNetworkInterceptor() instead of addInterceptor()

    */
    static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        retrofit = new Retrofit.Builder()
                .baseUrl("http://freeuniversalradio.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();



        return retrofit;
    }
}
