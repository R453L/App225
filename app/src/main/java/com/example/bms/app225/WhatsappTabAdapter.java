package com.example.bms.app225;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Toast;

public class WhatsappTabAdapter extends FragmentStatePagerAdapter {

    Context context;

    public WhatsappTabAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:return new WhatsappTabFragmentChats();
            case 1:return new WhatsappTabFragmentStatus();
            case 2:return new WhatsappTabFragmentCalls();
        }

        return new WhatsappTabFragmentChats();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "CHATS";
            case 1:return "STATUS";
            case 2:return "CALLS";
        }
        return super.getPageTitle(position);
    }
}
