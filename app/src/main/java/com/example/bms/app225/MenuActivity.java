package com.example.bms.app225;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button btnContextMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.btnPopupMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final PopupMenu popupMenu = new PopupMenu(MenuActivity.this,v);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch (id){
                            case R.id.ppitem1:
                                Toast.makeText(MenuActivity.this,"Item 1",Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.ppitem2:
                                Toast.makeText(MenuActivity.this,"Item 2",Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.ppitem3:
                                Toast.makeText(MenuActivity.this,"Item 3",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
            }
        });
        btnContextMenu = findViewById(R.id.btnContextMenu);
        btnContextMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        registerForContextMenu(btnContextMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case 0:
                Toast.makeText(MenuActivity.this,"Item 0",Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(MenuActivity.this,"Item 1",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MenuActivity.this,"Item 2",Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onContextItemSelected(item);
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}