package com.example.eyuuo.day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    //1.data 생성 >가변으로
    //String fruit[] = {"banana","apple","Fruit"};
    ArrayList<String> fruit = new ArrayList<String>(); //fuit 어레이 리스트 전역변수
    ArrayAdapter<String> adapter; //어뎁터 전역변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle("리스트를 알아보자");

        fruit.add("a");
        fruit.add("b");
        fruit.add("c");
       // String one = fruit.get(1);//b를 가져오자.
       // fruit.remove(1);//다 앞으로 정형 됨.
//final : 전역변수화 하지만 여기서는 인식을 안함.
        adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruit);//<>이라는 건 "제네릭"이라고 불린다. //this 현재 엑티비티
        ListView listview = findViewById(R.id.listview); //스피너면 리스트뷰를 스피널
        listview.setAdapter(adapter);

        //각 리스트에 이벤트 넣기******
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //콜백 함수.
                //포지션을 가지고 구분하는 것.position 바나나를 누르면 0번이 눌렸다는 정보가 넘어간다.>그거 건드리고 싶으면 데이타에 다시 접속해서 연결해야함
                String one = fruit.get(position);//b를 가져오자.
                Toast.makeText(ListActivity.this, one, Toast.LENGTH_SHORT).show();
                //내부 새로운 클레스 에서 this를 쓰려면 엑티비티 이름.this해야함**
            }
        });

        //꾸욱 누루면(setOnItemLongClickListener) 삭제되는 기능
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //데이터에서 삭제
                fruit.remove(position);
                //어뎁터에 통보
                adapter.notifyDataSetChanged();
                return false;
            }
        });
        //추가 수정까지!!
    }

    public void onAdd(View view) {
        //edit1에서 입력한 데이타 가져오기
        EditText editText = findViewById(R.id.edit1);
        String one = editText.getText().toString();
        //fruit에 추가하기
        fruit.add(one);
        //어댑터에 업데이트 요청.(통보)
        adapter.notifyDataSetChanged();
    }





}
