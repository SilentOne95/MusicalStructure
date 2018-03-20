package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class EighthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[12];
        titles[0] = "Wolves";
        titles[1] = "House on Fire";
        titles[2] = "The Violence";
        titles[3] = "Welcome To The Breakdown";
        titles[4] = "Far From Perfect";
        titles[5] = "Bullshit";
        titles[6] = "Politics of Love";
        titles[7] = "Parts Per Million";
        titles[8] = "Mourning in Amerika";
        titles[9] = "How Many Walls";
        titles[10] = "Miracle";

        ArrayList<Song> songItem = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songItem.add(new Song(titles[i], R.drawable.eighth_album));
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
