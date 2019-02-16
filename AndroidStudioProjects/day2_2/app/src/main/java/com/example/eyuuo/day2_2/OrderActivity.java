package com.example.eyuuo.day2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        text = findViewById(R.id.textView5);

        Intent intent = getIntent(); //보내는 타입과 받는 타입이 같아야
        String oder = intent.getStringExtra("oder");//앞에서 보낸 애 이름을 넣어야 한다. 타입 잘 구분해서 받기.
        text.setText(oder);



    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1,menu);//메뉴를 가져와 붙인다.
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_order){
            displayToast("Order");
        }
        if(item.getItemId()==R.id.action_status){
            displayToast("Status");
        }
        if(item.getItemId()==R.id.action_favorites){
            displayToast("Favoritive");
        }
        if(item.getItemId()==R.id.action_contact){
            displayToast("Contact");
        }
        //메뉴개수 만큼 해서 , 메뉴 누르면 토스트로 뜨게하자.
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
