package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;

public class eco_eng_mar extends AppCompatActivity {

    GridLayout mainGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_eng_mar);

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
                    Intent intent = new Intent(eco_eng_mar.this,EcoActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 1)
                {
                    Intent intent = new Intent(eco_eng_mar.this,EcoActivityEng.class);
                    startActivity(intent);
                }

            });
        }
    }
}