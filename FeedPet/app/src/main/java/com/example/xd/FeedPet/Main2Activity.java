package com.example.xd.FeedPet;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity{
    Button siguiente2;
    Button siguiente3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        siguiente2 = (Button) findViewById(R.id.button);
        siguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyente2 = new Intent(v.getContext(),Main3Activity.class);
                startActivity(oyente2);
            }
        });

        siguiente3 = (Button) findViewById(R.id.button2);
        siguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyente3 = new Intent(v.getContext(),Main4Activity.class);
                startActivity(oyente3);
            }
        });


    }
}
