package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    GridLayout mainGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


       mainGridLayout = (GridLayout) findViewById(R.id.mainGridLayout);

       setSingleEvent(mainGridLayout);

    }

    private void setSingleEvent(GridLayout mainGridLayout) {

        for (int i=0;i<mainGridLayout.getChildCount();i++)
        {
            CardView cardView =(CardView)mainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(view -> {
                if (finalI == 0)
                {
                    Intent intent = new Intent(MainActivity2.this,allsubactivity.class);
                    startActivity(intent);
                }
                else if (finalI == 1)
                {
                    Intent intent = new Intent(MainActivity2.this,WebsiteYoutube.class);
                    startActivity(intent);
                }
                else if (finalI == 2)
                {
                    Intent intent = new Intent(MainActivity2.this,Paper_listview.class);
                    startActivity(intent);
                }
                else if (finalI == 3)
                {
                    Intent intent = new Intent(MainActivity2.this,webview.class);
                    startActivity(intent);
                }

            });
        }
    }
}

