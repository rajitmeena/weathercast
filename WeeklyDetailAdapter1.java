package com.example.admin.weatherforecast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 8/17/2016.
 */
public class WeeklyDetailAdapter1 extends ArrayAdapter<WeeklyDetails> {


    ArrayList<WeeklyDetails> weeklyDetailClasses;
    Context mContext;

    public WeeklyDetailAdapter1(Context context, ArrayList<WeeklyDetails>objects) {
        super(context, 0,objects);
        weeklyDetailClasses=objects;
        mContext=context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v=convertView;
        v= LayoutInflater.from(mContext).inflate(R.layout.weekly_details,parent,false);
        TextView minTemp=(TextView)v.findViewById(R.id.minTemp);
        TextView maxTemp=(TextView)v.findViewById(R.id.maxTemp);
        TextView humidity=(TextView)v.findViewById(R.id.humidity);
        TextView windSpeed=(TextView)v.findViewById(R.id.wind_speed);
        TextView pressure=(TextView)v.findViewById(R.id.pressure);
        WeeklyDetails details=weeklyDetailClasses.get(position);
        minTemp.setText(details.getTemperatureMin());
        maxTemp.setText(details.getTemperatureMax());
        humidity.setText(details.getHumidity());
        windSpeed.setText(details.getWindSpeed());
        pressure.setText(details.getPressure());
        return v;
    }
}
