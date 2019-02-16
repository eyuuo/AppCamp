package com.example.eyuuo.day4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Switch;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mcount;
    public PagerAdapter(FragmentManager fm, int fragmentCount){
        super(fm);
        this.mcount = fragmentCount;
    }
    @Override
    public Fragment getItem(int i){
        switch(i){
            case 0: return new TabFragment();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            default: return null;
        }

    }

    public int getCount(){
        return mcount;
    }


}
