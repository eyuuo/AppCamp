package com.example.eyuuo.day2_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this,
                        OrderActivity.class);
                intent.putExtra( "oder", mOrderMessage);
                startActivity(intent);
            }
        });
    }


    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void oderDounut(View view) {
        mOrderMessage = getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
    }
    public void oderIce(View view) {
        mOrderMessage = getString(R.string.ice_cream_order_message);
        displayToast(mOrderMessage);
    }
    public void oderFroyo(View view) {
        mOrderMessage = getString(R.string.froyo_order_message);
        displayToast(mOrderMessage);

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



}
