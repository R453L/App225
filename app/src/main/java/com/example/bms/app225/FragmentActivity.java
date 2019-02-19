package com.example.bms.app225;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Fragment fragment1 = new Fragment1();
        this.setDefaultFragment(fragment1);

        findViewById(R.id.btnFragment1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fr = new Fragment1();
                replaceFragment(fr);
            }
        });
        findViewById(R.id.btnFragment2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fr = new Fragment2();
                replaceFragment(fr);
            }
        });
    }

    public void setDefaultFragment(Fragment fragment1) {
        this.replaceFragment(fragment1);
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fm = this.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLayout,fragment);
        ft.commit();
    }
}
