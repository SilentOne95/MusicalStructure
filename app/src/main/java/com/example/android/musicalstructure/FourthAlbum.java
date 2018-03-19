package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class FourthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songItem = new ArrayList<>();
        songItem.add(new Song("Chamber the Cartridge", R.drawable.fourth_album));
        songItem.add(new Song("Injection", R.drawable.fourth_album));
        songItem.add(new Song("Ready to Fall", R.drawable.fourth_album));
        songItem.add(new Song("Bricks", R.drawable.fourth_album));
        songItem.add(new Song("Under the Knife", R.drawable.fourth_album));
        songItem.add(new Song("Prayer of the Refugee", R.drawable.fourth_album));
        songItem.add(new Song("Drones", R.drawable.fourth_album));
        songItem.add(new Song("The Approaching Curve", R.drawable.fourth_album));
        songItem.add(new Song("Worth Dying For", R.drawable.fourth_album));
        songItem.add(new Song("Behind Closed Doors", R.drawable.fourth_album));
        songItem.add(new Song("Roadside", R.drawable.fourth_album));
        songItem.add(new Song("Good Left Undone", R.drawable.fourth_album));
        songItem.add(new Song("Survive", R.drawable.fourth_album));
        songItem.add(new Song("Built to Last", R.drawable.fourth_album));

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
