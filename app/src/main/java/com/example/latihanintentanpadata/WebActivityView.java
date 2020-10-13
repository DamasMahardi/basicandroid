package com.example.latihanintentanpadata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivityView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.ubuntu.com");

    }
}