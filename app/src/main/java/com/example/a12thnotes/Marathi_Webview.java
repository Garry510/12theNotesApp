package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class Marathi_Webview extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi__webview);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        webView = findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/१.वेगवशता.html");
        }
        else if (position==1){
            webView.loadUrl("file:///android_asset/२. रोज मातीत.html");
        }
        else if (position==2){
            webView.loadUrl("file:///android_asset/३. आयुष्य... आनंदाचा उत्सव.html");
        }
        else if (position==3){
            webView.loadUrl("file:///android_asset/४. रे थांब जरा आषाढघना.html");
        }
        else if (position==4){
            webView.loadUrl("file:///android_asset/५. वीरांना सलामी.html");
        }
        else if (position==5){
            webView.loadUrl("file:///android_asset/६. रंग माझा वेगळा.html");
        }
        else if (position==6){
            webView.loadUrl("file:///android_asset/६.१.आत्मविश्वाससारखी शक्ती नाही.html");
        }
        else if (position==7){
            webView.loadUrl("file:///android_asset/८. रेशीमबंध.html");
        }
        else if (position==8){
            webView.loadUrl("file:///android_asset/९. समुद्र कोंडून पडलाय.html");
        }
        else if (position==9){
            webView.loadUrl("file:///android_asset/१०. दंतकथा.html");
        }
        else if (position==10){
            webView.loadUrl("file:///android_asset/११. आरशातली स्त्री.html");
        }
        else if (position==11){
            webView.loadUrl("file:///android_asset/१२ .१.जयपूर फूट चे जनक.html");
        }
        else if (position==12){
            webView.loadUrl("file:///android_asset/१२. रंगरेषा व्यंगरेषा.html");
        }
        else if (position==13){
            webView.loadUrl("file:///android_asset/१३.१. शोध.html");
        }
        else if (position==14){
            webView.loadUrl("file:///android_asset/१३.२ . गढी.html");
        }
        else if (position==15){
            webView.loadUrl("file:///android_asset/१४.१ उपयोजित मराठी.html");
        }
        else if (position==16){
            webView.loadUrl("file:///android_asset/१४.२ माहितीपत्रक.html");
        }
        else if (position==17){
            webView.loadUrl("file:///android_asset/१४.३ अहवाल.html");
        }
        else if (position==18){
            webView.loadUrl("file:///android_asset/१४.४ वृत्तलेख (फिचर रायटिंग).html");
        }
        else if (position==19){
            webView.loadUrl("file:///android_asset/भाग - २  गद्य व पद्य.html");
        }
        else if (position==20){
            webView.loadUrl("file:///android_asset/भाग १  गद्य व पद्य.html");
        }
        else if (position==21){
            webView.loadUrl("file:///android_asset/भाग ३  साहित्यप्रकार (कथा).html");
        }



    }
}
