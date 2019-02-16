package com.example.eyuuo.day5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //어떤 데이타를 가지고 다수의 목록을 표현하고 싶을때
    RecyclerView recyclerView;
    ArrayList<String> data = new ArrayList<String>();//인스턴스로 만들고
    MsgAdapter adapter;//선언 어케 하지?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    private  void  init(){
        recyclerView = findViewById(R.id.rlist1);
        //1.데이터
        data.add(new String("사과"));
        data.add(new String("사과2"));
        data.add(new String("사과3"));

        //2.어댑터 : RecyclerVeiw.Adapter/ RecyclerVeiw.Viewholder이미 만들어져 잇는 클래스
        //여러가지 종류의 핀이 있듯이 리사이클러 어뎁터가
        adapter = new MsgAdapter(data, this);
        //adapter = new FruitAdapter(this, data);
        //3.어댑터 ->list
        recyclerView.setAdapter(adapter);

        //화면모양
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
//Recycler어댑터.