package com.example.eyuuo.day3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //menu를 만든 것을 추가 한다.
    //임플레이트_뻥튀기 하다...xml을 가져다가 view로 만드는 것
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1,menu);//메뉴를 가져와 붙인다.
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.mnuOrder){
            displayToast("Order");
        }
        if(item.getItemId()==R.id.mnuOrder2){
            displayToast("Status");
        }
        if(item.getItemId()==R.id.mnuOrder3){
            displayToast("Favoritive");
        }
        if(item.getItemId()==R.id.mnuOrder4){
            displayToast("Contact");
        }
        //메뉴개수 만큼 해서 , 메뉴 누르면 토스트로 뜨게하자.
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

}
