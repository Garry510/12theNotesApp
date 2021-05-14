package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class EcoWebviewEng extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_webview_eng);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        webView = findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/1.Introducation to micro economice and macro economice eco ch.1.html");
        }
        else if (position==1){
            webView.loadUrl("file:///android_asset/2.Utilility Analysiseco ch.2.html");
        }
        else if (position==2){
            webView.loadUrl("file:///android_asset/3.A Demand Analysisi eco ch.3a.html");
        }
        else if (position==3){
            webView.loadUrl("file:///android_asset/3.B Elasticity of Demand eco ch.3b.html");
        }
        else if (position==4){
            webView.loadUrl("file:///android_asset/4.Supply Analysis eco ch.4.html");
        }
        else if (position==5){
            webView.loadUrl("file:///android_asset/5.Forms of market  eco ch.5.html");
        }
        else if (position==6){
            webView.loadUrl("file:///android_asset/6.Index numbers eco ch.6.html");
        }
        else if (position==7){
            webView.loadUrl("file:///android_asset/7.National Income eco ch.7.html");
        }
        else if (position==8){
            webView.loadUrl("file:///android_asset/8.Public finance in india eco ch.8.html");
        }
        else if (position==9){
            webView.loadUrl("file:///android_asset/9. Money market and capital market in india eco ch.9.html");
        }
        else if (position==10){
            webView.loadUrl("file:///android_asset/10.Foreign trade of india eco ch.10.html");
        }

    }
}