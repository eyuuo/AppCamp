package com.example.eyuuo.day4_2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FruitAdapter extends BaseAdapter {
    ArrayList<Fruit> data;
    //Fruit추가
    Context c;

    FruitAdapter(Context c, ArrayList<Fruit> data){
        this.c=c;
        this.data= data;

    }
    @Override //데이타개수
    public int getCount() {
        return data.size();
    }

    @Override //데이타
    public Fruit getItem(int position) {
        return data.get(position);
    }

    @Override //뭘로 리턴
    public long getItemId(int position) {
        return position;
    }

    @Override //view를 만들어서 붙이고..붙이고..
    public View getView(int position, View convertView, ViewGroup parent) {
        //택스트 뷰를 만들어둔 곳에 banana를 넣어야 positioㅜ 위치 정보
        //1뷰를 만든다. implates 화면에 보여줄 수 있는 개수만큼만 뷰를 보여주고 내리면 쿄체하는 식으로 진행된다.
        if(convertView==null){//null되면 값넣어주고
            convertView = View.inflate(c,R.layout.list_item, null);
        }//inflate : 판대기 만드릭
        //2 데이터를 변경한다.
        TextView tv = convertView.findViewById(R.id.textView);
        ImageView iv = convertView.findViewById(R.id.image);

        iv.setImageResource(data.get(position).getImagid());
        tv.setText(data.get(position).getName());
        //3.뷰를 리턴한다.
        return convertView;
    }
}

//생성자//new word(arrayList)


