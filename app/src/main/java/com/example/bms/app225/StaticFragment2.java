package com.example.bms.app225;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.bms.app225.R;

public class StaticFragment2 extends Fragment {
    EditText edtUsernameHolder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.static_fragment_2,container,false);
        edtUsernameHolder = v.findViewById(R.id.edt_username_holder);

        Bundle bundle = this.getArguments();

        if(bundle!=null){
            String user = bundle.getString("USERNAME");
            edtUsernameHolder.setText(user);
        }

        return v;
    }
}
