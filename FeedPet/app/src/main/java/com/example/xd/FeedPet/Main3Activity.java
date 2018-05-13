package com.example.xd.FeedPet;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {
    ImageButton siguiente4;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        siguiente4 = (ImageButton) findViewById(R.id.iButton2);
        siguiente4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyente4 = new Intent(v.getContext(),Main5Activity.class);
                startActivity(oyente4);
            }
        });

        volver = (Button) findViewById(R.id.button3);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyente5 = new Intent(v.getContext(),Main2Activity.class);
                startActivity(oyente5);
            }
        });

    }
}
