package com.example.bms.app225;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.net.URL;

public class AsyncTaskActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);

        textView = findViewById(R.id.textView);
        textView.setText("OnCreate");

        new MyTask().execute("hello");
    }
    private class MyTask extends AsyncTask<String,Void,Void>{

        @Override
        protected Void doInBackground(String... strings) {
            return null;
        }
    }

}
