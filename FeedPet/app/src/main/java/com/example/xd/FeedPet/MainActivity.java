package com.example.xd.FeedPet;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton siguiente;
    NotificationCompat.Builder nBuilder;
    int mNotificationID = 1561994;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        siguiente = (ImageButton) findViewById(R.id.iButton1);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyente1 = new Intent(v.getContext(),Main2Activity.class);
                startActivity(oyente1);
            }
        });

        nBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.ic_notification_clear_all)
                .setContentTitle("Feed Pet")
                .setContentText("Hora de Comer")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        // Create an explicit intent for an Activity in your app
        Intent intent = new Intent(this,Main2Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        nBuilder.setContentIntent(pendingIntent);

        NotificationManager mNotifyMgr =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        mNotifyMgr.notify(mNotificationID,nBuilder.build());
    }
}
