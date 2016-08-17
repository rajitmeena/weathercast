package com.example.admin.weatherforecast;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Admin on 7/28/2016.
 */
public class WeeklyDownloadTask  extends AsyncTask<String,Void,WeeklyDetails[]> {


    public interface WeeklyDownloadTaskInterface{
        void processResults(WeeklyDetails[] data);
    }
    WeeklyDownloadTaskInterface listener;

    public WeeklyDownloadTask(WeeklyDownloadTaskInterface listener) {
        this.listener = listener;
    }
    private WeeklyDetails[] parseJson(String json){
        try{
            JSONObject obj=new JSONObject(json);
            JSONArray weeklyUpdates=obj.getJSONArray("data");
            WeeklyDetails[] output=new WeeklyDetails[weeklyUpdates.length()];
            for (int i=0;i<weeklyUpdates.length();i++){
                JSONObject weeksUpdatesJSONObject=weeklyUpdates.getJSONObject(i);
                int minTemp=weeksUpdatesJSONObject.getInt("temperatureMin");
                int maxTemp=weeksUpdatesJSONObject.getInt("temperatureMax");
                int humidity=weeksUpdatesJSONObject.getInt("humidity");
                int windSpeed=weeksUpdatesJSONObject.getInt("windSpeed");
                int pressure=weeksUpdatesJSONObject.getInt("pressure");

                output[i]=new WeeklyDetails(minTemp,maxTemp,humidity,windSpeed,pressure);

            }
            return output;
        }catch (JSONException e){
            return null;
        }
    }

    @Override
    protected WeeklyDetails[] doInBackground(String... params) {
        if (params.length==0)
            return null;
        StringBuffer buffer=new StringBuffer();
        try{
            URL url=new URL(params[0]);
            HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();

            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            InputStream inputStream=urlConnection.getInputStream();
            if (inputStream==null){
                return null;
            }
            Scanner s=new Scanner(inputStream);
            while (s.hasNext()){
                buffer.append(s.nextLine());
            }
            Log.i("Jsondata",buffer.toString());
        }catch (MalformedURLException e){
            return null;
        }catch (ProtocolException e){
            return null;
        }catch (IOException e){
            return null;
        }

return parseJson(buffer.toString());
    }
}
