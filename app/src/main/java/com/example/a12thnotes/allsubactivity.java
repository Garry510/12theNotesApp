package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;

public class allsubactivity extends AppCompatActivity {

    GridLayout mainGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allsubactivity);

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
                    Intent intent = new Intent(allsubactivity.this,eco_eng_mar.class);
                    startActivity(intent);
                }
                else if (finalI == 1)
                {
                    Intent intent = new Intent(allsubactivity.this,HistoryActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 2)
                {
                    Intent intent = new Intent(allsubactivity.this,PoliticalActivity.class);
                    startActivity(intent);
                }
                else if (finalI == 3)
                {
                    Intent intent = new Intent(allsubactivity.this,Marathi_Activity.class);
                    startActivity(intent);
                }

            });
        }
    }
}
