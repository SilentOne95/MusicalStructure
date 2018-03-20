package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class FourthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[14];
        titles[0] = "Chamber the Cartridge";
        titles[1] = "Injection";
        titles[2] = "Ready to Fall";
        titles[3] = "Bricks";
        titles[4] = "Under the Knife";
        titles[5] = "Prayer of the Refugee";
        titles[6] = "Drones";
        titles[7] = "The Approaching Curve";
        titles[8] = "Worth Dying For";
        titles[9] = "Behind Closed Doors";
        titles[10] = "Roadside";
        titles[11] = "Good Left Undone";
        titles[12] = "Survive";
        titles[13] = "Built to Last";

        ArrayList<Song> songItem = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songItem.add(new Song(titles[i], R.drawable.fourth_album));
        }

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
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
