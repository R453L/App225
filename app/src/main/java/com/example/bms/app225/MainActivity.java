package com.example.bms.app225;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setLogo(R.drawable.ic_home);


        findViewById(R.id.btnCustomToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customToast(v);
            }
        });
        findViewById(R.id.btnProgressBar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ProgressBarActivity.class));
            }
        });
        findViewById(R.id.btnProgressDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ProgressDialogActivity.class));
            }
        });
        findViewById(R.id.btnAsyncProgress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AsyncTaskActivity.class));
            }
        });
        findViewById(R.id.btnListView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ListViewActivity.class));
            }
        });
        findViewById(R.id.btnGridView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GridViewActivity.class));
            }
        });
        findViewById(R.id.btnFragmentActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FragmentActivity.class));
            }
        });
    }

    public void customToast(View v){
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.custom_toast_layout));
        TextView text = layout.findViewById(R.id.tv1);
        text.setText("This is a custom toast to make the customized view");

        Toast toast = new Toast(MainActivity.this);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        MenuItem search = menu.findItem(R.id.search);
        SearchView sv = (SearchView) search.getActionView();

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.item1:
                Toast.makeText(MainActivity.this,"Item 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(MainActivity.this,"Item 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(MainActivity.this,"Item 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(MainActivity.this,"Item 4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item5:
                Toast.makeText(MainActivity.this,"Item 5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(MainActivity.this,"Search Menu",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
