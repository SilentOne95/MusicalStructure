package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class SixthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[12];
        titles[0] = "Architects";
        titles[1] = "Help Is On The Way";
        titles[2] = "Make It Stop";
        titles[3] = "Disparity by Design";
        titles[4] = "Satellite";
        titles[5] = "Midnight Hands";
        titles[6] = "Survivor Guilt";
        titles[7] = "Broken Mirrors";
        titles[8] = "Wait for Me";
        titles[9] = "A Gentlemen's Coup";
        titles[10] = "This Is Letting Go";
        titles[11] = "Endgame";

        ArrayList<Song> songItem = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songItem.add(new Song(titles[i], R.drawable.sixth_album));
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
