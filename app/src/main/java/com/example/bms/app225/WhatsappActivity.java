package com.example.bms.app225;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

public class WhatsappActivity extends AppCompatActivity {

    TabLayout whatsappTabLayout;
    ViewPager whatsappViewPager;
    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);

        toolbar = findViewById(R.id.whatsapp_toolbar);
        setSupportActionBar(toolbar);

        setTitle("Whatsapp");

        whatsappTabLayout = findViewById(R.id.whatsapp_tab_layout);
        whatsappViewPager = findViewById(R.id.whatsapp_view_pager);

        WhatsappTabAdapter adapter = new WhatsappTabAdapter(getSupportFragmentManager(),this);

        whatsappViewPager.setAdapter(adapter);
        whatsappTabLayout.setupWithViewPager(whatsappViewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        MenuItem search = menu.findItem(R.id.search);
        SearchView sv = (SearchView) search.getActionView();

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(WhatsappActivity.this,query,Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(WhatsappActivity.this,"Item 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(WhatsappActivity.this,"Item 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(WhatsappActivity.this,"Item 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(WhatsappActivity.this,"Item 4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item5:
                Toast.makeText(WhatsappActivity.this,"Item 5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(WhatsappActivity.this,"Search Menu",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
