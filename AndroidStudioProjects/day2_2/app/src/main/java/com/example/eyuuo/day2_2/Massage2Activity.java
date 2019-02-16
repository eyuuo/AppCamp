package com.example.eyuuo.day2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Massage2Activity extends AppCompatActivity {
    EditText edit2;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage2);

        text2 = findViewById(R.id.text2);
        edit2 = findViewById(R.id.editR);
        Intent intent = getIntent(); //보내는 타입과 받는 타입이 같아야
        String act1 = intent.getStringExtra("send");//앞에서 보낸 애 이름을 넣어야 한다. 타입 잘 구분해서 받기.

        text2.setText("  "+act1);
    }


    public void onClickReply(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra("reply",edit2.getText().toString());//값 하나 보냈다.
        setResult(RESULT_OK, intent);//request 코드와 result코드. 서로 상호적인 관계 //startActivity대신.

        finish();
    }
}
