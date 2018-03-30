package com.phirathat.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 5835512090 on 3/30/2018.
 */
//Recycler View
public class RecyclerViewMain extends AppCompatActivity implements ItemClickListener {

    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

        String[] list = { "SuperMan", "Wonder Woman", "The Flash","Iron Man", "Black Panther", "Spiderman","DeadPool" };
        int[] resId = {  R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                R.drawable.image6,
                R.drawable.image7
        };

        RecyclerView listViewR = findViewById(R.id.reclycerlist);
        adapter = new RecyclerViewAdapter(getApplicationContext(), list,resId);
        listViewR.setLayoutManager(new LinearLayoutManager(this));
        adapter.setClickListener(this);
        listViewR.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Click: " + adapter.getItem(position) +
                " on row:" + position, Toast.LENGTH_SHORT).show();
    }

}
