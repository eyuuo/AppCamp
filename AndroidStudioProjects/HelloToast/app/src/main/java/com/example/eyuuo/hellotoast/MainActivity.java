package com.example.eyuuo.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    private int N =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        t1 = (TextView) findViewById(R.id.TextView); //텍스트 내용 동기화.
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT); //toast라는 함수를 이용하여 텍스트를 띄운다.
        toast.show();//텍스트를 보여준다.
    }

    public void addCount(View view){
        ++N;
        if(t1 != null)
            t1.setText(Integer.toString(N));
    }
}
