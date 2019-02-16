package com.example.eyuuo.day2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FourActivity extends AppCompatActivity {
    TextView tv3;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        tv3 = findViewById(R.id.t3);
        editText = findViewById(R.id.editText);

        Intent intent = getIntent(); //보내는 타입과 받는 타입이 같아야
        String act1 = intent.getStringExtra("act1");//앞에서 보낸 애 이름을 넣어야 한다. 타입 잘 구분해서 받기.

        tv3.setText(act1);
    }

    public void onClick1(View view){//1번에 전송하고 이 창은 종료.

        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra("act4",editText.getText().toString());//값 하나 보냈다.
        setResult(RESULT_OK, intent);//request 코드와 result코드. 서로 상호적인 관계 //startActivity대신.

        finish();
    }

    public void onClick(View view){
        finish();
    }
}
