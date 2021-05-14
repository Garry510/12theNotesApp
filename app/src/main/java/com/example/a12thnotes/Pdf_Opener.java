package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf_Opener extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf__opener);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        myPDFViewer=(PDFView)findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);

        if (position==0){
            myPDFViewer.fromAsset("Economic Paper 2020.pdf").load();
        }
        else if (position==1){
            myPDFViewer.fromAsset("History Paper 2020.pdf").load();
        }
        else if (position==2){
            myPDFViewer.fromAsset("Sociology Paper 2020.pdf").load();
        }
        else if (position==3){
            myPDFViewer.fromAsset("Marathi Paper 2020.pdf").load();
        }
        else if (position==4){
            myPDFViewer.fromAsset("Political Science Paper 2020.pdf").load();
        }
        else if (position==5){
            myPDFViewer.fromAsset("English Paper 2020.pdf").load();
        }

        }

    }