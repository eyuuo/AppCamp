package com.example.eyuuo.day5;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView webView;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
       // @4//@3
        webView.addJavascriptInterface(new MyInterface(this),"myapp"); //인터페이스 이름을.

        //@1
        //1.progressbardialog생성
        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading....");
        //2.모양지정
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);//대화상자만듬.
        //>> 1),2) 두개다 구현해야함.
        //1)
        webView.setWebViewClient(new WebViewClient(){
            @Override //started!시작에 뭐 띄우기.
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                //3.보이기
                dialog.show();
            }
        });

        //2)
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {//현재 몇퍼센트 진행되었느지 알려주는 함수.
                super.onProgressChanged(view, newProgress);//prograss가 100퍼센트가 ㅗ되면종료
                //4.숨기기
                if(newProgress ==100) dialog.dismiss();//그만보이기.
            }
        });
        //@2
        //주소가 들어오면 내가 처리하겠다.이걸해야지 앱안에서 생긴다. 안그러면 크롬으로 들어가짐.
        //추상메소드가 없어서 이렇게 간단하다.하지만 더 자세한ㄷ...
        webView.loadUrl("file:///android_asset/index.html");//에셋폴더에 index.html파일 내가 만든 거.
        //https://m.naver.com m모바일 버전.//www는 웹버전.
        //권한이 필요하다.매니패스트에<uses-permission android:name="android.permission.INTERNET" 어플리ㅣ케이션 위에 추가

    }

    public void onClick(View view) {
        //index.html에 있는 자바스크립트를 부르고 싶다.
        webView.loadUrl("javascript:displayMsg()");
    }
}
//@1
//앱으로 랩핑하여!
//웹서버의 크라이언트 = 브라우저(html,css,자바스트립트를 처리)\
//위치정보. 자바그크립ㅌ, 줌 러용. 등등 모든 설정이 가능하다.페이지가 끝날때 또는 시작할때 기능을 오버라이딩을 통해 설정할 수 이다. 페이지가 데이타를 받아올때 로딩중을 뜬다던가. 페이지가 받아오기 시작하는 것. 기능...!!
//webchromeclient
//webviewclient 이 두가지를 이용하여 오버라이딩을 해서 하면 되는 것.
//데이타가 많은 페이지는 로딩이 길다...그때 기다리는 로딩다이얼로그를 띄우자.

//@2
//직접 html을 넣으면 다운받을때만 인터넷쓰고 그 뒤로는 인터넷 필요 없음. 안드로이드 스튜디오에 html을 내부적으로 장 > 폴더 > 에셋폴더 >생성.

//@3
//엑티비티에 만든 기능을 쓰고 싶을떄, 토스트 버튼 이런거. 웹페이지를 통해서 네이티브 웹사이트와 연결하는 무언가. 통신할것이 필요
//APP과  Web Page사이의 통신.
//

//@4
//자바스크크핍트...에서 호출할 함수만 자밧,ㅋ,ㄹㅂㅌ, 아더..자밧,ㅋ,ㄹㅂ;ㅌ,기 읽어낸ㄷ.