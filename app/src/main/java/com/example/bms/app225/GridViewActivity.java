package com.example.bms.app225;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;
    GridViewAdapter gridAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.gridview);
        gridAdapter = new GridViewAdapter(this);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,""+position,Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.RED);

                Bundle extra = new Bundle();
                //extra.putInt("IMAGE_ID",mIcon[position]);
                extra.putString("TITLE",""+position);

                Intent intent = new Intent(GridViewActivity.this,ShowDataActivity.class);
                intent.putExtras(extra);
                startActivity(intent);
            }
        });
        gridView.setAdapter(gridAdapter);
    }
}
