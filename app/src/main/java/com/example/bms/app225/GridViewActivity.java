package com.example.bms.app225;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;
    GridViewAdapter gridAdapter;
    ArrayList<Integer> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        arrayList.add(R.drawable.icon_1);
        arrayList.add(R.drawable.icon_2);
        arrayList.add(R.drawable.icon_3);
        arrayList.add(R.drawable.icon_4);
        arrayList.add(R.drawable.icon_5);
        arrayList.add(R.drawable.icon_6);
        arrayList.add(R.drawable.icon_7);
        arrayList.add(R.drawable.icon_8);
        gridView = findViewById(R.id.gridview);
        gridAdapter = new GridViewAdapter(this,arrayList);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,""+position,Toast.LENGTH_SHORT).show();
                //view.setBackgroundColor(Color.RED);

                Bundle extra = new Bundle();
                extra.putInt("IMAGE_ID",arrayList.get(position));
                extra.putString("TITLE",""+position);

                Intent intent = new Intent(GridViewActivity.this,ShowDataActivity.class);
                intent.putExtras(extra);
                startActivity(intent);
            }
        });
        gridView.setAdapter(gridAdapter);
    }
}
