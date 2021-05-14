package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class Political_Webview extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_political__webview);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        webView = findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/१.१९९१ नंतरचे जग.html");
        }
        else if (position==1){
            webView.loadUrl("file:///android_asset/२.१९९१ नंतरच्या महत्त्वाच्या संकल्पना आणि समस्या  जागतिकीकरण.html");
        }
        else if (position==2){
            webView.loadUrl("file:///android_asset/३ .१९९१ नंतरच्या महत्त्वाच्या संकल्पना आणि समस्या  मानवतावादी प्रश्न.html");
        }
        else if (position==3){
            webView.loadUrl("file:///android_asset/४.समकालीन भारत शांतता, स्थैर्य आणि राष्ट्रीय एकात्मतेसमोरील आव्हाने.html");
        }
        else if (position==4){
            webView.loadUrl("file:///android_asset/५.समकालीन भारत सुशासन.html");
        }
        else if (position==5){
            webView.loadUrl("file:///android_asset/६ .भारत आणि जग.html");
        }


    }
}
