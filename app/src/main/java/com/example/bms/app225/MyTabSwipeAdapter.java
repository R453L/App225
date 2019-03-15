package com.example.bms.app225;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyTabSwipeAdapter extends FragmentStatePagerAdapter {

    MyTabSwipeAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        TabFragment f1 = new TabFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("KEY1",i+1);
        f1.setArguments(bundle);
        return f1;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String s = "";
        switch (position){
            case 0:
                s = "Tab 1";
                break;
            case 1:
                s = "Tab 2";
                break;
            case 2:
                s = "Tab 3";
                break;
        }
        return s;
    }
}
