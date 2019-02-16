package com.example.eyuuo.day2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv = findViewById(R.id.txtname); //연결
        //intent(복도)확인해서 뭐가 정보가 왔는지 확인.
        Intent intent = getIntent(); //보내는 타입과 받는 타입이 같아야
        String name = intent.getStringExtra("name");//앞에서 보낸 애 이름을 넣어야 한다. 타입 잘 구분해서 받기.

        tv.setText(name);
    }

    public void onClick(View view){
        finish();
    }
}
