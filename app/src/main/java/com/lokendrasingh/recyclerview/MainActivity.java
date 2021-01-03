package com.lokendrasingh.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    String s1[], s2[];
    int imageResource[]= {R.drawable.abhishek,R.drawable.akash,R.drawable.aman,R.drawable.ashish,R.drawable.deepak,R.drawable.golu,R.drawable.lokendra,R.drawable.pawan};
    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1= findViewById(R.id.recyclerview);
        s1= getResources().getStringArray(R.array.Employee);
        s2= getResources().getStringArray(R.array.Description);
        ad= new MyOwnAdapter(this, s1,s2,imageResource);        // passing data to MyOwnAdapter.java class
        r1.setAdapter(ad);                                         // attaching the adapter to recycler
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}