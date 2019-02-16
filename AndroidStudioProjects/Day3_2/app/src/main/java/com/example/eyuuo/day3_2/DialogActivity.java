//창띄우기. 버전1(예,아니요).2(선택).3(다중선택).4(editText넣고 받기. View사용.)

package com.example.eyuuo.day3_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {
    String menu[] = {"닭","소","돼지","양"};//선택된 값을 가지고 있는 전역변수도 필요하다.다이로그 2
    int selectedIndex;
   //EditText e1;

    boolean checked[] = {true,true,false,false};//체크박스의 체크를 위해서.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        //e1 = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button :
                showDialog1();
                break;
            case R.id.button2 :
                showDialog2();
                break;
            case R.id.button3 :
                showDialog3();
                break;
            case R.id.button4 :
                showDialog4();
                break;
        }
    }

    public void displayToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
    //다이얼 로그 만들기
    public void  showDialog1(){
        AlertDialog.Builder dig = new AlertDialog.Builder(this);
       /*
        // dig.setTitle("기본 대화 상자");//커멘드키 + 누르면 어떻게 생긴 함수인지 볼 수 있다. 클레스 안에 내부 클래스가 하나 더 있다. 셋타이틀은 오버로딩으로 두개가 만들어져 있다 return값이 자기 자신 : 리턴하면 나. 하면 니.
        // dig.setMessage("기본 대화 상자입니다.");
        dig.setTitle("기본 대화 상자")
                .setMessage("기본 대화 상자 입니다.");
                .setIcon(R.drawable.ic_launcher_foreground)
                .show();
        //dig.setTitle("").setMessage(""); 이렇게 해도 된다. 코드의 생긴게 저렁게 생겼으니까.
        */
        dig.setTitle("기본대화상자");
        dig.setMessage("기본 대화 상자입니다.");
        dig.setIcon(R.drawable.ic_launcher_foreground).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast("ok");
            }
        });//onClickListner : ok누르면 뭘할지,
        dig.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast("no");
            }
        });//no버튼 누르면 뭐할지 _토스트를 하게 했다.//두가지 버전으로 가능.~.~; .~;
        dig.show();


    }

    //다른 다이얼로그 만들기.
    public void  showDialog2(){
        //배열을 만들자.
        //String menu[] = {"닭","소","돼지","양"};

        AlertDialog.Builder dig = new AlertDialog.Builder(this);

        dig.setTitle("기본대화상자");
        //dig.setMessage("기본 대화 상자입니다."); //배열 넣으려면 이거 못씀.
        dig.setSingleChoiceItems(menu, selectedIndex, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //누른 번호를 받아서 액션을 취해야함. menu[]가 전역변수가 되어야 한다.
                selectedIndex=which;
            }
        });//대신 이거 넣음.//3:돼지

        dig.setIcon(R.drawable.ic_launcher_foreground).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                displayToast(menu[selectedIndex]+ " 선택");
            }
        });//onClickListner : ok누르면 뭘할지,

        dig.show();


    }

    public void  showDialog3(){//다중 선택은?
        AlertDialog.Builder dig = new AlertDialog.Builder(this);

        dig.setTitle("기본대화상자");
        //멀티플 선택 아이템!
        dig.setMultiChoiceItems(menu, checked, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                //대문자 Boolean은 클래스다. 기본타입을 클래스화 시킨 것. boolean은 다르다.
                //isChecked에 ㅊ체크 유무와 which에 선택된 번호가 들어감
               checked[which]=isChecked;//**
            }
        });
        dig.setIcon(R.drawable.ic_launcher_foreground).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String str = "";
                for(int i =0; i < checked.length;i++){
                    if(checked[i]==true)
                        str += ","+menu[i];
                }
                displayToast(str+ " 선택");
            }
        });//onClickListner : ok누르면 뭘할지,

        dig.show();


    }


    public void  showDialog4(){

        View dlgView = View.inflate(this,R.layout.dialog, null);
        final EditText e1 = dlgView.findViewById(R.id.editText);//이렇게 dlgView.을 이용해서 연결을 해야함.e1

        AlertDialog.Builder dig = new AlertDialog.Builder(this);

        dig.setTitle("기본대화상자");
        dig.setView(dlgView);
        dig.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = e1.getText().toString();
                displayToast("당신의 이름은 "+name+"입니다.");
            }
        });

        dig.show();
    }
}


//배열을 만들고. choice뭐시기로 하며 ㄴ됩니다.