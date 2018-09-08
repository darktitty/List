package com.blacktitty.list;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] name;
    String[] tittle;
    String[] position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        name = res.getStringArray(R.array.name);
        tittle = res.getStringArray(R.array.tittle);
        position = res.getStringArray(R.array.position);

        ItemAdapter itemAdapter = new ItemAdapter(this, name, tittle, position);
        myListView.setAdapter(itemAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int s, long id) {
                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("com.blacktitty.ITEM_INDEX", s);
                startActivity(showDetailActivity);
            }
        });
    }
}
