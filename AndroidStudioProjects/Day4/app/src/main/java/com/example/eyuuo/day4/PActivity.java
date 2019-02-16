package com.example.eyuuo.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class PActivity extends AppCompatActivity {
    LinearLayout content1, content2, content3;
    android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);
        content1 = findViewById(R.id.content1);
        content2 = findViewById(R.id.content2);
        content3 = findViewById(R.id.content3);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }


    public void onClick(View view) {
        content1.setVisibility(View.VISIBLE);
        content2.setVisibility(View.INVISIBLE);
        content3.setVisibility(View.INVISIBLE);
    }
    public void onClick2(View view) {
        content1.setVisibility(View.INVISIBLE);
        content2.setVisibility(View.VISIBLE);
        content3.setVisibility(View.INVISIBLE);
    }public void onClick3(View view) {
        content1.setVisibility(View.INVISIBLE);
        content2.setVisibility(View.INVISIBLE);
        content3.setVisibility(View.VISIBLE);
    }





}
