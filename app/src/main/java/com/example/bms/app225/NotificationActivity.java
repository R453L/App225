package com.example.bms.app225;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        findViewById(R.id.btn_create_notification).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateNotification();
            }
        });
        findViewById(R.id.btn_cancel_notification).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CancelNotification();
            }
        });
    }

    private void CreateNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        builder.setSmallIcon(R.drawable.ic_launcher_foreground);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.journaldev.com/"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
        builder.setContentIntent(pendingIntent);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        builder.setContentTitle("Notification Title");
        builder.setContentText("You have received this cool notification!");
        builder.setSubText("Tap to visit");
        builder.setTicker("Notification ticker");

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1,builder.build());
    }

    private void CancelNotification() {
        String ns = Context.NOTIFICATION_SERVICE;
        NotificationManager notificationManager =
                (NotificationManager) getApplicationContext().getSystemService(ns);
        notificationManager.cancel(1);
    }

}
