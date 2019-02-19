package com.example.bms.app225;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListView mList;
    String mTitle[] = {"Title 1","Title 2","Title 3","Title 4"};
    String mSubtitle[] = {"Subtitle 1","Subtitle 2","Subtitle 3","Subtitle 4"};
    Integer mIcon[] = {R.drawable.icon_1,R.drawable.icon_2,R.drawable.icon_3,R.drawable.icon_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListViewAdapter mAdapter = new ListViewAdapter(this,mTitle,mSubtitle,mIcon);
        mList = findViewById(R.id.listview);
        mList.setAdapter(mAdapter);

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"Clicked on "+mTitle[position],Toast.LENGTH_SHORT).show();

                Bundle extra = new Bundle();
                extra.putInt("IMAGE_ID",mIcon[position]);
                extra.putString("TITLE",mTitle[position]);

                Intent intent = new Intent(ListViewActivity.this,ShowDataActivity.class);
                intent.putExtras(extra);
                startActivity(intent);
            }
        });
    }
}
