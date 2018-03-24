package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class SecondAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[13];
        titles[0] = "Black Masks and Gasoline";
        titles[1] = "Heaven Knows";
        titles[2] = "Dead Ringer";
        titles[3] = "Halfway There";
        titles[4] = "Like the Angel";
        titles[5] = "Voices Off Camera";
        titles[6] = "Blood-Red, White and Blue";
        titles[7] = "Broken English";
        titles[8] = "Last Chance Blueprint";
        titles[9] = "To the Core";
        titles[10] = "Torches";
        titles[11] = "Amber Changing";
        titles[12] = "Any Way You Want It";

        ArrayList<Songs> songsList = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songsList.add(new Songs(titles[i], R.drawable.second_album));
        }

        GridSongsAdapter adapter = new GridSongsAdapter(this, songsList);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

}
