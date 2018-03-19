package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class FifthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songItem = new ArrayList<>();
        songItem.add(new Song("Collapse", R.drawable.fifth_album));
        songItem.add(new Song("Long Forgotten Sons", R.drawable.fifth_album));
        songItem.add(new Song("Re-Education", R.drawable.fifth_album));
        songItem.add(new Song("The Dirt Whispered", R.drawable.fifth_album));
        songItem.add(new Song("Kotov Syndrome", R.drawable.fifth_album));
        songItem.add(new Song("From Heads Unworthy", R.drawable.fifth_album));
        songItem.add(new Song("The Strength to Go On", R.drawable.fifth_album));
        songItem.add(new Song("Audience of One", R.drawable.fifth_album));
        songItem.add(new Song("Entertainment", R.drawable.fifth_album));
        songItem.add(new Song("Hero of War", R.drawable.fifth_album));
        songItem.add(new Song("Savior", R.drawable.fifth_album));
        songItem.add(new Song("Hairline Fracture", R.drawable.fifth_album));
        songItem.add(new Song("Whereabouts Unknown", R.drawable.fifth_album));
        songItem.add(new Song("Historia calamitatum", R.drawable.fifth_album));

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
