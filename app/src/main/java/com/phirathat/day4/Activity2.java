package com.phirathat.day4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ph.GOF on 3/29/2018.
 */
// Custom List View
public class Activity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        String[] list = { "SuperMan", "Wonder Woman", "The Flash","Iron Man", "Black Panther", "Spiderman","DeadPool" };
        int[] resId = {  R.drawable.image1,
                         R.drawable.image2,
                         R.drawable.image3,
                         R.drawable.image4,
                         R.drawable.image5,
                         R.drawable.image6,
                         R.drawable.image7
        };

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);
        final ListView listView = (ListView)findViewById(R.id.Clist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long row_id) {
//                TextView textView = (TextView)view.findViewById(R.id.textView1);
//                System.out.println( textView.getText());
                String  itemValue    = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "You Selected: " +  itemValue , Toast.LENGTH_SHORT).show();
            }
        });
    }
}

