package com.example.eyuuo.day5;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class MyInterface {
    Context context;

    MyInterface(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void displayToast(){
        //context필요.
        Toast.makeText(context, "hello world!!", Toast.LENGTH_SHORT).show();
    }
}
//자바스크립트 인터페이스로 쓸 거면. @JavascriptInterface이걸 붙이삼.