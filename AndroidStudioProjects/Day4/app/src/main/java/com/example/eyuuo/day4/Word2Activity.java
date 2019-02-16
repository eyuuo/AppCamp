package com.example.eyuuo.day4;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Word2Activity extends AppCompatActivity {
    ArrayList<Fruit> data = new ArrayList<Fruit>();
    FruitAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initListView();

    }

    private void initListView() {

        //1.data를 만든다.
        //Fruit one = new Fruit()(R.drawable.app;e(아이콘 이름),"")
        data.add(new Fruit(R.drawable.donut_circle, "banana1"));
        data.add(new Fruit(R.drawable.froyo_circle, "banana2"));
        data.add(new Fruit(R.drawable.icecream_circle, "banana3"));

        //2.어댑터를 만든다. 어떤 컨텍스,어떤 뷰, 어떤 데이타
        adapter = new FruitAdapter(this, data);
    }/*
        //3.어댑터를 리스투뷰에 연결
        listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);

        //4.이벤트는 연결한다.선택된 것이 누구나.

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                displayToast(data.get(position).getName());
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                disPlayD(position);
                return false;
            }
        });

    }*/

    public void displayToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void disPlayD(final int position){
        String title = data.get(position).getName();
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setTitle("d").setMessage(title+"dd")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                data.remove(position);
                adapter.notifyDataSetChanged();
            }
        })
                .setNegativeButton("no",null)
                .show();
    }


}


/*
1. 레이아웃에 ListVIew를 넣는다.
2. 액티비티
    1. 데이터를 만든다
    2. 어댑터를 마든다(데이터 + 뷰)
    3. 어댑터를 ListVIew에 연결
    4. 이벤트를 건다.
    5. 추가/삭제
        1. 데이터 가변배열
        2. 데이터를 추가/삭제
        3. 어댑터에 통보

1.데이터 클래스 변경 : 이미지id/과일이름
2.레이아웃 변경
3.어댑터 변경
 */

/*
omg.setImageResource(R.drawable.app;e);
 */

//data.add(new String("hello");