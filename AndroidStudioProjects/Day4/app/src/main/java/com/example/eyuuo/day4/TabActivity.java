//viewPager: 정보받아서 fragment를 보여줌
//tabpager: 텝버튼
//fragment

package com.example.eyuuo.day4;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter; //내가 만든 함수

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //툴바
       // android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);//툴바가 보이게 된다.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        //그 안드로이드의 코드는 여기다가 다 코딩했지만, 이 코딩은 viewPager와 tabLayout, 이렇게 두가지 기능으로 나눠서 정의하였다.
        initTab();
        initViewPager();
    }

    private void  initViewPager(){
        //ViewPager의 기능!!
        viewPager= findViewById(R.id.view_pager);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));//뷰페이져의 설정 중 tabLayout과 연결해주는 작업.

    }

    private void initTab(){
        //tabLayout의 기능!!
        tabLayout = findViewById(R.id.tab_layout);
        //직접지정//디자인에 추가하면 안되는 것.
        tabLayout.addTab(tabLayout.newTab().setText("T1"));
        tabLayout.addTab(tabLayout.newTab().setText("T2"));
        tabLayout.addTab(tabLayout.newTab().setText("T3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Setting a listener for clicks.

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {//안드로이드 OS가 tab감지하고 콜백. 텝의 정보를 가지고 와서
                //객체지향. 텝레이아웃(이 함수를이용해서 텝을 감지하고 뷰페리져에게 알려줌., 뷰페이져(어뎁터 존재,탭레이아웃에게 정보 받아서 해당 framet나오게 해. 어떤 버튼 누르면 fragment나오게 구현해놓음)
                viewPager.setCurrentItem(tab.getPosition());
                //옆으로 넘기는게 가능해짐.
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //온클릭이 아니다. 콜백.

    }

}


//viewPager
/*
* 1.레이아웃에 ViewPager
* 2.Fragment를 3개 만든다.
* 3.FragmentAdapter -3개의 fragment을 연결
* 4.FragmentAdapter를 ViewPager에 꼿는다.
*
*<-버튼 만들기(숙제!)
*
*
*
*
* */