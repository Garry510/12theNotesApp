package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class HistoryWebview extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_webview);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        webView = findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/१.युरोपातील प्रबोधन आणि विज्ञानाचा विकास.html");
        }
        else if (position==1){
            webView.loadUrl("file:///android_asset/२.युरोपीय वसाहतवाद.html");
        }
        else if (position==2){
            webView.loadUrl("file:///android_asset/३.भारत आणि युरोपीय वसाहतवाद.html");
        }
        else if (position==3){
            webView.loadUrl("file:///android_asset/४.वसाहतवाद आणि मराठे.html");
        }
        else if (position==4){
            webView.loadUrl("file:///android_asset/५.भारत  सामाजिक व धार्मिक सुधारणा.html");
        }
        else if (position==5){
            webView.loadUrl("file:///android_asset/६.वसाहतवादाविरुद्ध भारतीयांचा संघर्ष.html");
        }
        else if (position==6){
            webView.loadUrl("file:///android_asset/७.भारत  निर्वसाहतीकरण ते एकीकरण.html");
        }
        else if (position==7){
            webView.loadUrl("file:///android_asset/८.जागतिक महायुद्धे आणि भारत.html");
        }
        else if (position==8){
            webView.loadUrl("file:///android_asset/९.जग निर्वसाहतीकरण.html");
        }
        else if (position==9){
            webView.loadUrl("file:///android_asset/१०.शीतयुद्ध.html");
        }
        else if (position==10){
            webView.loadUrl("file:///android_asset/११.बदलता भारत-भाग १.html");
        }
        else if (position==11){
            webView.loadUrl("file:///android_asset/१२.बदलता भारत-भाग २.html");
        }

    }
}
