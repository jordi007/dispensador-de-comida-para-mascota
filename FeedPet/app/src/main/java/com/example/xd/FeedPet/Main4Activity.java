package com.example.xd.FeedPet;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button volver2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       volver2 = (Button) findViewById(R.id.button4);
        volver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyente6 = new Intent(v.getContext(),Main2Activity.class);
                startActivity(oyente6);
            }
        });

    }
}