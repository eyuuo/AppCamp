package com.example.eyuuo.day2_2;

import android.os.MemoryFile;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    int selectedIndex = 0;
    EditText title,content;
    Memo memo[] = new Memo[3];

    @Override//>//부모가 미리 만들어둔 함수를 다시 정의 하는 것.
    //Overloading : 함수의 이름은 똑같은데 파라미터는 다른것
    protected void onCreate(Bundle savedInstanceState) {
        //1.필요한 component 선언/연결/이벤트
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        for(int i =0; i< memo.length; i++){
            memo[i] = new Memo();//초기화
        }
    }

    public void init(){
        title = (EditText) findViewById(R.id.edit1);
        content = (EditText) findViewById(R.id.edit2);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.b1:
                selectedIndex = 0;
                getMemo();
                break;
            case R.id.b2:
                selectedIndex = 1;
                getMemo();
                break;
            case R.id.b3:
                selectedIndex = 2;
                getMemo();
                break;
            case R.id.bReset:
                memoReset();
                break;
            case R.id.bSave:
                memoSave();
                break;
        }
    }

    public void memoReset(){
        title.setText("");
        content.setText("");
    }
    public void memoSave(){
        Toast.makeText(this, "저장되었습니다.", Toast.LENGTH_SHORT).show();
    }
    public void getMemo(){
        title.setText(memo[selectedIndex].getTitle());
        content.setText(memo[selectedIndex].getContent());

    }

}
//data class를 만들어야 한다.
//1.class의 이름은 어떻게 할까. : MeMo
//2.전역변수(맴버변수) 정하고 : 제목과 내용
//3.멤버메소드 정해 :