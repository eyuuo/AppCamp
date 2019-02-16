package com.example.eyuuo.day2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassageMainActivity extends AppCompatActivity {

    EditText edit1;
    Button b;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage);
        text1 = findViewById(R.id.text1);
        edit1 = findViewById(R.id.editS);
        b = findViewById(R.id.b1);


    }

    public void onclickSend(View view) {
        Intent intent = new Intent(this, Massage2Activity.class);
        intent.putExtra("send",edit1.getText().toString());
        startActivityForResult(intent,10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 10){
            if(resultCode == RESULT_OK){
                String msg4 = data.getStringExtra("reply");
                text1.setText("  "+msg4);
            }
        }
    }
}
