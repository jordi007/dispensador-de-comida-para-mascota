package com.example.xd.FeedPet;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    Button volver3;
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        volver3 = (Button) findViewById(R.id.button5);
        volver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyente7 = new Intent(v.getContext(),Main2Activity.class);
                startActivity(oyente7);
            }
        });

        mWebView =(WebView) findViewById(R.id.activity_main_webview);
        mWebView.getSettings().setJavaScriptEnabled(true);

        mWebView.loadUrl("http://192.168.43.240/paginaArqui/index.html");

        mWebView.setWebViewClient(new WebViewClient());




    }
    @Override
    public void onBackPressed(){
        if(mWebView.canGoBack()){
            mWebView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}