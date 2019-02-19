package com.example.bms.app225;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressDialogActivity extends AppCompatActivity {
    Button show;
    ProgressDialog progressDialog;
    private int progressBarStatus = 0;
    private Handler progressDialogHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);

        findViewById(R.id.btnShow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                push(v);
            }
        });
        findViewById(R.id.btnShowIndeterminate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                push2(v);
            }
        });
    }
    public void push(View v){
        progressDialog = new ProgressDialog(v.getContext());
        progressDialog.setIcon(R.drawable.ic_home);
        progressDialog.setCancelable(true);
        progressDialog.setMessage("Downloading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setProgress(0);
        progressDialog.setMax(100);
        progressDialog.show();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressBarStatus < 100){
                    progressBarStatus += 1;
                    progressDialog.setProgress(progressBarStatus);

//                    progressDialogHandler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            progressDialog.setProgress(progressBarStatus);
//                        }
//                    });
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                progressDialog.dismiss();
            }
        });
        t.start();
    }
    public void push2(View v){
        progressDialog = new ProgressDialog(v.getContext());
        progressDialog.setIcon(R.drawable.ic_home);
        progressDialog.setCancelable(true);
        progressDialog.setMessage("Downloading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(true);
//        progressDialog.setProgress(0);
//        progressDialog.setMax(100);
        progressDialog.show();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressBarStatus < 100){
                    progressBarStatus += 1;
                    //progressDialog.setProgress(progressBarStatus);

//                    progressDialogHandler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            progressDialog.setProgress(progressBarStatus);
//                        }
//                    });
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                progressDialog.dismiss();
            }
        });
        t.start();
    }
}
