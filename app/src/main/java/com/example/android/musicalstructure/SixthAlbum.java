package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class SixthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songItem = new ArrayList<>();
        songItem.add(new Song("Architects", R.drawable.sixth_album));
        songItem.add(new Song("Help Is On The Way", R.drawable.sixth_album));
        songItem.add(new Song("Make It Stop", R.drawable.sixth_album));
        songItem.add(new Song("Disparity by Design", R.drawable.sixth_album));
        songItem.add(new Song("Satellite", R.drawable.sixth_album));
        songItem.add(new Song("Midnight Hands", R.drawable.sixth_album));
        songItem.add(new Song("Survivor Guilt", R.drawable.sixth_album));
        songItem.add(new Song("Broken Mirrors", R.drawable.sixth_album));
        songItem.add(new Song("Wait for Me", R.drawable.sixth_album));
        songItem.add(new Song("A Gentlemen's Coup", R.drawable.sixth_album));
        songItem.add(new Song("This Is Letting Go", R.drawable.sixth_album));
        songItem.add(new Song("Endgame", R.drawable.sixth_album));

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
