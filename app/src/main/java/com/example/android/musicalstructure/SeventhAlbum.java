package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class SeventhAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[12];
        titles[0] = "The Great Die-Off";
        titles[1] = "I Don't Want to Be Here Anymore";
        titles[2] = "Tragedy + Time";
        titles[3] = "The Black Market";
        titles[4] = "The Eco-Terrorist In Me";
        titles[5] = "Sudden Life";
        titles[6] = "A Beautiful Indifference";
        titles[7] = "Methadone";
        titles[8] = "Zero Visibility";
        titles[9] = "Awake Too Long";
        titles[10] = "People Live Here";
        titles[11] = "Bridges";

        ArrayList<Song> songItem = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songItem.add(new Song(titles[i], R.drawable.seventh_album));
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
