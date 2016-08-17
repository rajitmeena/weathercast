package com.example.admin.weatherforecast;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Admin on 8/13/2016.
 */
public interface WAPIInterface {
    @GET("/28.612868,77.2310990")
    Call<WeeklyUpdate> getWeeklyUpdate();



}
