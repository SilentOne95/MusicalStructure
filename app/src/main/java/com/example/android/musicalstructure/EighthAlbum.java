package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class EighthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songItem = new ArrayList<>();
        songItem.add(new Song("Wolves", R.drawable.eighth_album));
        songItem.add(new Song("House on Fire", R.drawable.eighth_album));
        songItem.add(new Song("The Violence", R.drawable.eighth_album));
        songItem.add(new Song("Welcome To The Breakdown", R.drawable.eighth_album));
        songItem.add(new Song("Far From Perfect", R.drawable.eighth_album));
        songItem.add(new Song("Bullshit", R.drawable.eighth_album));
        songItem.add(new Song("Politics of Love", R.drawable.eighth_album));
        songItem.add(new Song("Parts Per Million", R.drawable.eighth_album));
        songItem.add(new Song("Mourning in America", R.drawable.eighth_album));
        songItem.add(new Song("Mourning in Amerika", R.drawable.eighth_album));
        songItem.add(new Song("How Many Walls", R.drawable.eighth_album));
        songItem.add(new Song("Miracle", R.drawable.eighth_album));

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
