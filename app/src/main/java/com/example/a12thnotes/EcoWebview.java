package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class EcoWebview extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_webview);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        webView = findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/१. सूक्ष्म अर्थशास्त्र आणि स्थूल अर्थशास्त्राचा परिचय.html");
        }
        else if (position==1){
            webView.loadUrl("file:///android_asset/२. उपयोगिता विश्लेषण.html");
        }
        else if (position==2){
            webView.loadUrl("file:///android_asset/३ अ) मागणीचे विश्लेषण.html");
        }
        else if (position==3){
            webView.loadUrl("file:///android_asset/३.ब) मागणीची लवचिकता.html");
        }
        else if (position==4){
            webView.loadUrl("file:///android_asset/४. पुरवठा विश्लेषण.html");
        }
        else if (position==5){
            webView.loadUrl("file:///android_asset/५. बाजाराचे प्रकार.html");
        }
        else if (position==6){
            webView.loadUrl("file:///android_asset/६. निर्देशांक.html");
        }
        else if (position==7){
            webView.loadUrl("file:///android_asset/७. राष्ट्रीय उत्पन्न.html");
        }
        else if (position==8){
            webView.loadUrl("file:///android_asset/८.भारतातील सार्वजनिक वित्त व्यवहार.html");
        }
        else if (position==9){
            webView.loadUrl("file:///android_asset/९.भारतातील नाणे बाजार आणि भांडवल बाजार.html");
        }
        else if (position==10){
            webView.loadUrl("file:///android_asset/१०.भारताचा विदेशी व्यापार.html");
        }
    }
}