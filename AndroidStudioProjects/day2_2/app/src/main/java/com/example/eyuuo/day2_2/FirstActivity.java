package com.example.eyuuo.day2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        setTitle("첫번째 액티비티");
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit1);
        b1 = findViewById(R.id.b1);
        tv4 = findViewById(R.id.t4);
/*
        Intent intent = getIntent(); //보내는 타입과 받는 타입이 같아야
        String name = intent.getStringExtra("act4");//앞에서 보낸 애 이름을 넣어야 한다. 타입 잘 구분해서 받기.
        tv3.setText(name);*/
    }

    public void onClick2(View view){//2번째로 이동
        Intent intent = new Intent(this, SecondActivity.class);
        //실제 부르기
        startActivity(intent);
    }
    public void onClick3(View view){//3번째로 이동
        //Intent는 복도 Actvity는 방
        Intent intent = new Intent(this, ThirdActivity.class);
        //데이타방출이 필요하다. 3벝째가 데이터를 받아야 한다.이름과 값
        intent.putExtra("name",e1.getText().toString());//값 하나 보냈다.
        //실제 부르기
        startActivity(intent);//양방향에 쓰이지 않는다.
    }
    public void onClick4(View view){//4번째로
        Intent intent = new Intent(this, FourActivity.class);
        intent.putExtra("act1",e2.getText().toString());
        startActivityForResult(intent,100); //리퀘스트 코드를 사용해서 양방향성을 만든다.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        if(requestCode == 100){
            if(resultCode == RESULT_OK){
                String msg4 = data.getStringExtra("act4");
                tv4.setText(msg4);
            }
        }
    }
}
