package com.example.admin.weatherforecast;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 8/13/2016.
 */
public class WAPIClient {

    private static WAPIInterface service;

    public static WAPIInterface getService(){
        Retrofit r=new Retrofit.Builder().baseUrl("https://api.forecast.io/forecast/e3377eb0d03f3163533834f97080c761")
                .addConverterFactory(GsonConverterFactory.create(
                        new GsonBuilder().create()
                )).build();
        service=r.create(WAPIInterface.class);
        return service;
    }

}
