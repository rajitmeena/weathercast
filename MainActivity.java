package com.example.admin.weatherforecast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ArrayList<WeeklyDetails>details;
    WeeklyDetailAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        details=new ArrayList<>();

        String urlString="https://api.forecast.io/forecast/e3377eb0d03f3163533834f97080c761/28.6316578,77.1195835";
        WeeklyDownloadTask task=new WeeklyDownloadTask((WeeklyDownloadTask.WeeklyDownloadTaskInterface) this);
        task.execute(urlString);


        adapter=new WeeklyDetailAdapter(this,details);
        mRecyclerView.setAdapter(adapter);



        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(lm);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("On Pause", "On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("On Pause", "On Pause");
    }

    public void processResults(WeeklyDetails[] weeks) {
        if (weeks == null)
            return;
        details.clear();
        for (WeeklyDetails w: weeks) {
            details.add(w);
        }
        adapter.notifyDataSetChanged();
    }




}

















