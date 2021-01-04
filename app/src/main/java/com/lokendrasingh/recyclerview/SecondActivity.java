package com.lokendrasingh.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ImageView mainImage;
    TextView t1, t2;
    String data1, data2;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mainImage= findViewById(R.id.IntentImage);
        t1= findViewById(R.id.IntentTitle);
        t2= findViewById(R.id.IntentDescription);
        getData();
        setData();
    }
    private void getData()
    {
        if(getIntent().hasExtra("title")&& getIntent().hasExtra("description")&& getIntent().hasExtra("image"))
        {
        data1= getIntent().getStringExtra("title");
        data2= getIntent().getStringExtra("description");
        image= getIntent().getIntExtra("image",1);
    }
        else{
            Toast.makeText(this, "not working",Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        t1.setText(data1);
        t2.setText(data2);
        mainImage.setImageResource(image);
    }
}