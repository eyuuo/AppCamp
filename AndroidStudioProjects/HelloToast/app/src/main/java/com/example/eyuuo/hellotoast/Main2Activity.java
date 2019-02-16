package com.example.eyuuo.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
     TextView t1;
     TextView t2;
     TextView t3;
     CheckBox ch1; //체크 박스와 네모난 모양이랑(라디언 버튼)의 차이 : 체크박스는 중복선택이 가능하다. 라디언은 중복이 안된다.
    //라디언은 그룹으로 묶어 줘야 한다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();

    }

    public void init(){
        t1 = (TextView) findViewById(R.id.editText);
        t2 = (TextView) findViewById(R.id.editText2);
        t3 = (TextView) findViewById(R.id.editText3);
        ch1 = (CheckBox) findViewById(R.id.checkBox);
    }

    public void getResult(View view){
        int N=0;
        N = Integer.parseInt(t1.getText().toString())*1000 + Integer.parseInt(t2.getText().toString())*1500 +Integer.parseInt(t3.getText().toString())*1700;
        if(ch1.isChecked())
            N = N*90/100;
        String result= Integer.toString(N) ;
        Toast.makeText(this, N+"", Toast.LENGTH_SHORT).show();


    }


}
//스넥바
//현재 기기에 딱맞게 보여주겠다. > 리뉴얼 레이어블