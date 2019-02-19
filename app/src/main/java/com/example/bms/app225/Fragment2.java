package com.example.bms.app225;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2,container,false);

        tv = v.findViewById(R.id.tvResult);
        Bundle bundle = this.getArguments();
        if (bundle!=null){
            int sum = bundle.getInt("sum",0);

            tv.setText(sum);
        }

        return v;
    }
}
