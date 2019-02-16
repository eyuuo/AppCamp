package com.example.eyuuo.day3_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }

    public void onClick(View view) {
        showDialog();
    }

    public void  showDialog(){
        //다이얼로그 생성
        AlertDialog.Builder dig = new AlertDialog.Builder(this);

        //다이얼로그 설정
        dig.setTitle("Alert");
        dig.setMessage("Click Ok to continue, or Cancel to stop : ");
        dig.setIcon(R.drawable.ic_launcher_foreground);

        //ok와 cancel버튼 생성 및 눌렀을때 액션
        dig.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast("pressed ok");
            }
        });
        dig.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast("pressed cancel");
            }
        });

        //보여주기
        dig.show();


    }
    
    public void displayToast(String str){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
