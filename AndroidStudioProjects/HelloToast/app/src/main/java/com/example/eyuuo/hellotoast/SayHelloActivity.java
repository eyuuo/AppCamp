package com.example.eyuuo.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SayHelloActivity extends AppCompatActivity {
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello);
        text1 = findViewById(R.id.text1);

        Intent intent = getIntent(); //보내는 타입과 받는 타입이 같아야
        String name = intent.getStringExtra("num");
    }
}
