package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class SeventhAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songItem = new ArrayList<>();
        songItem.add(new Song("The Great Die-Off", R.drawable.seventh_album));
        songItem.add(new Song("I Don't Want to Be Here Anymore", R.drawable.seventh_album));
        songItem.add(new Song("Tragedy + Time", R.drawable.seventh_album));
        songItem.add(new Song("The Black Market", R.drawable.seventh_album));
        songItem.add(new Song("The Eco-Terrorist In Me", R.drawable.seventh_album));
        songItem.add(new Song("Sudden Life", R.drawable.seventh_album));
        songItem.add(new Song("A Beautiful Indifference", R.drawable.seventh_album));
        songItem.add(new Song("Methadone", R.drawable.seventh_album));
        songItem.add(new Song("Zero Visibility", R.drawable.seventh_album));
        songItem.add(new Song("Awake Too Long", R.drawable.seventh_album));
        songItem.add(new Song("People Live Here", R.drawable.seventh_album));
        songItem.add(new Song("Bridges", R.drawable.seventh_album));

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
