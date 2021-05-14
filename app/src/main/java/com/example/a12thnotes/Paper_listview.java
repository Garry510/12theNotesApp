package com.example.a12thnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Paper_listview extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_listview);

        listView = findViewById(R.id.ListView);
        String[] storyNames=getResources().getStringArray(R.array.Papers);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.item_list,R.id.row_txt,storyNames);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Paper_listview.this,Pdf_Opener.class);
                intent.putExtra("story_key",position);
                startActivity(intent);

            }
        });

    }
}