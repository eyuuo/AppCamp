package com.example.eyuuo.day5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;

import java.util.ArrayList;

//RecyclerView.Adapter 최소한 3개가 있어야지 만들 수 있다. //이거 세개를 꼿아줘여 사용이 가능하니까.
public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.MyPanel> {
    ArrayList <String> data = new ArrayList<String>();
    Context context; //뷰를 만들떄는 꼭 필요한 친구.

    MsgAdapter(ArrayList<String> data, Context context){
        /*
        data.add("포카리"); 여기서 데이타 관리 가능.하지만 파라미터를 선언해서 메인에서 넣게 하자.
        data.add("포카리2");*/
        this.context = context;
                this.data = data;
    }
    @NonNull
    @Override //판넬을 만드는 역할을 하는 list_ont.xml을 연결시켜쥬는..? 1 //타입이 같으면 편해.//DB에서 데이타를
    public MsgAdapter.MyPanel onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //View view = View.inflate(context,R.layout.list_one, viewGroup);//고수님이 적어주신 건뎅...왜,,,
        //MsgAdapter.MyPanel pan = new MsgAdapter.MyPanel(view);//

         View view = LayoutInflater.from(context).inflate(R.layout.list_one,viewGroup,false);

        return new MyPanel(view);

    }

    @Override //뷰홀더와 데이타를 연결해주는 애. 2 //xml(판넬 재료) //데이타, 컨텍스트 ,뷰.
    public void onBindViewHolder(@NonNull MsgAdapter.MyPanel viewHolder, int i) {
        //add data
        viewHolder.textView.setText(data.get(i));


    }

    @Override //데이타 개수, 실제 존재하는 데이타와 개수가 일치해야. 오류가 안남.
    public int getItemCount() {
        return data.size();
    }

    //외부에 따로 파일만들어서 만들어보되지만 여기에다가 인어클래스가능 wkrdjqdms durltj
    class MyPanel extends RecyclerView.ViewHolder{
        TextView textView;
        public  MyPanel(@NonNull View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.txtmsg);

        }
    }
}
