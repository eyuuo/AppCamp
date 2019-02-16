package com.example.eyuuo.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //똑같이 선언하면 된다
    Button b1; //아이디
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//레이아웃을 처음에 컨텐트 뷰로 설정했다.

        init();

    }

    public void init(){
        //1.버튼을 클릭하면 (Button)
        //2.Hello world!! -> Hi!!로 변함. (이벤트) 버튼과,텍스트뷰가 필요해진다. (TextView. text속성 변경)
        b1 = (Button) findViewById(R.id.b1);
        t1 = (TextView) findViewById(R.id.textView);

        //1.버튼을 클릭하면
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2.Hello world!! -> Hi!!
                t1.setText("Hi!!!");
            }
        });
    }
    //2번째 방법
    public void onClickb1(View view){
        if(view.getId()==R.id.b1)
            t1.setText("Hi!!");
        else
            t1.setText(R.string.hello);

    }

    //이미지 파일 이름에는 소문자와 숫자만 넣어야 한다.
    //3버ㄴ째..?implements 사용해서 하는 거.

}
