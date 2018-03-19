package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class SecondAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songItem = new ArrayList<>();
        songItem.add(new Song("Black Masks and Gasoline", R.drawable.second_album));
        songItem.add(new Song("Heaven Knows", R.drawable.second_album));
        songItem.add(new Song("Dead Ringer", R.drawable.second_album));
        songItem.add(new Song("Halfway There", R.drawable.second_album));
        songItem.add(new Song("Like the Angel", R.drawable.second_album));
        songItem.add(new Song("Voices Off Camera", R.drawable.second_album));
        songItem.add(new Song("Blood-Red, White and Blue", R.drawable.second_album));
        songItem.add(new Song("Broken English", R.drawable.second_album));
        songItem.add(new Song("Last Chance Blueprint", R.drawable.second_album));
        songItem.add(new Song("To the Core", R.drawable.second_album));
        songItem.add(new Song("Torches", R.drawable.second_album));
        songItem.add(new Song("Amber Changing", R.drawable.second_album));
        songItem.add(new Song("Any Way You Want It", R.drawable.second_album));

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
