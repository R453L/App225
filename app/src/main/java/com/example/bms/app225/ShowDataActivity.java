package com.example.bms.app225;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDataActivity extends AppCompatActivity {

    ImageView ivShowData;
    TextView tvShowData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        ivShowData = findViewById(R.id.ivshowdata);
        tvShowData = findViewById(R.id.tvshowdata);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();

        ivShowData.setImageResource(extra.getInt("IMAGE_ID"));
        tvShowData.setText(extra.getString("TITLE"));
    }
}
