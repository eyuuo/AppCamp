package com.example.eyuuo.day3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ArrayList<String> phone = new ArrayList<String>();
    ArrayAdapter<CharSequence> adapter;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
       /* if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }*/


        phone.add("Home");
        phone.add("Work");
        phone.add("Moblie");
        phone.add("Other");

       adapter =  ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.select_dialog_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

    //spinner 누르면 액션 생성.->공부**


    }

    public void onRadioButtonClicked(View view) {
        if(view.getId()==R.id.sameday) displayToast("Same day messenger service");
        if(view.getId()==R.id.nextday) displayToast("Next day ground delivery");
        if(view.getId()==R.id.pickup) displayToast("Pick up");
    }

    public void displayToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, FloatingActivity.class);
        //실제 부르기
        startActivity(intent);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String spinnerLabel = adapterView.getItemAtPosition(position).toString();
        displayToast(spinnerLabel);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
//spinner,리스트뷰 : 웨젯을 레이아웃에 넣는다.
//1번 레이아웃에 어댑터뷰를 배치
//저버에서의 malloc> 어레이리스트를 사용해서 합니다.
//data Class> data 배열
//어댑터에 정보 널고 그걸 리스트에 꼿으면.
/*----------
ListView/Spinner

widget : layout
data/layout => adapter //데이타를 어뎁터에 넣고

adapter => widget


*/