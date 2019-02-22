package com.example.bms.app225;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bms.app225.R;

public class StaticFragment1 extends Fragment {
    EditText edtUsername;
    EditText edtPassword;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.static_fragment_1,container,false);

        edtUsername = v.findViewById(R.id.edt_username);
        edtPassword = v.findViewById(R.id.edt_password);
        v.findViewById(R.id.btn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUsername.getText().toString().trim();
                String pass = edtPassword.getText().toString().trim();

                if(!user.equals("")){
                    Bundle bundle = new Bundle();
                    bundle.putString("USERNAME",user);

                    StaticFragment2 frag = new StaticFragment2();
                    frag.setArguments(bundle);

                    getFragmentManager().beginTransaction()
                            .replace(R.id.static_fragment_2,frag)
                            .commit();
                    Toast.makeText(getContext(),"submit success",Toast.LENGTH_SHORT).show();

                    edtUsername.setText("");
                    edtPassword.setText("");
                }else{
                    Toast.makeText(getContext(),"input valid data!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }
}
