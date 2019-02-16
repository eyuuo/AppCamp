package com.example.eyuuo.day2_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("두번째 액티비티");
    }
    public void onClick(View view){
        finish();//창 종료하기 함수***

    }
}
