package com.example.eyuuo.day4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private Context context;
    private ArrayList<String> data;

    //in a class
    class WordViewHolder extends RecyclerView.ViewHolder{
        TextView tv ;
        public WordViewHolder(@NonNull View itemView){
            super(itemView);

            tv = itemView.findViewById(R.id.textView);
        }
    }

    WordAdapter(Context context,ArrayList<String> data){
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public WordAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //내가 만든걸로 타입을 바꿔줘야 한다.(위)
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);

        return new WordViewHolder(view); //view홀더...레이아웃..새로운 판대기..그 정보를
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder wordViewHolder, int i) {
        wordViewHolder.tv.setText(data.get(i));
    }//밑에가 기본적으로 생기는데 그렇게 말고 위에처럼 고쳐줘야 한다.

    //@Override
    //public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    //    }

    @Override //data context View
    public int getItemCount() {
        return data.size();
    }
}
