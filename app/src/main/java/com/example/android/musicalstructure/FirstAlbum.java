package com.example.android.musicalstructure;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class FirstAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[16];
        titles[0] = "Alive and Well";
        titles[1] = "My Life Inside Your Heart";
        titles[2] = "Great Awakening";
        titles[3] = "Six Ways 'Til Sunday";
        titles[4] = "401 Kill";
        titles[5] = "The Art of Losing";
        titles[6] = "Remains of Summer Memories";
        titles[7] = "The Unraveling";
        titles[8] = "Reception Fades";
        titles[9] = "Stained Glass and Marble";
        titles[10] = "Everchanging";
        titles[11] = "Sometimes Selling Out Is Giving Up";
        titles[12] = "3 Day Weekend";
        titles[13] = "1000 Good Intentions";
        titles[14] = "Weight of Time";
        titles[15] = "Faint Resemblance";

        ArrayList<Song> songItem = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songItem.add(new Song(titles[i], R.drawable.first_album));
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
