package com.example.admin.weatherforecast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 7/26/2016.
 */
public class WeeklyDetailAdapter extends RecyclerView.Adapter<WeeklyDetailAdapter.OurHolder>
{

    public class OurHolder extends RecyclerView.ViewHolder{
        TextView tv1;
        TextView tv2;
        ImageView Iv;


        public OurHolder(View ItemView){
            super(ItemView);
            tv1=(TextView)ItemView.findViewById(R.id.maxTemp);
            tv2=(TextView)ItemView.findViewById(R.id.minTemp);
            Iv=(ImageView)ItemView.findViewById(R.id.weeklyImageView);

        }


    }
    Context mContext;
    ArrayList<WeeklyDetails>details;

    public WeeklyDetailAdapter(Context mContext, ArrayList<WeeklyDetails> details) {
        this.mContext = mContext;
        this.details = details;
    }
    @Override
    public OurHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.weekly_details,parent,false);
        return new OurHolder(v);
    }

    @Override
    public void onBindViewHolder(OurHolder holder, final int position) {
        final WeeklyDetails w=details.get(position);
        holder.tv1.setText(w.getTemperatureMax()+"");
        holder.tv2.setText(w.getTemperatureMin()+"");


    }

    @Override
    public int getItemCount() {
        return details.size();
    }

}
