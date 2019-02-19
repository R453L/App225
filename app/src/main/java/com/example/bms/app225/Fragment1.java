package com.example.bms.app225;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class Fragment1 extends Fragment {
    EditText edt1,edt2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1,container,false);

        edt1 = v.findViewById(R.id.edt1);
        edt2 = v.findViewById(R.id.edt2);

        v.findViewById(R.id.btnSum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = edt1.getText().toString();
                String b = edt2.getText().toString();
                int sum = Integer.parseInt(a)+Integer.parseInt(b);

                Fragment2 fragment2 = new Fragment2();
                Bundle bundle = new Bundle();
                bundle.putInt("sum",sum);

                //fragment2.setArguments(bundle);

                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout,fragment2);
                ft.commit();
            }
        });


        return v;
    }
}
