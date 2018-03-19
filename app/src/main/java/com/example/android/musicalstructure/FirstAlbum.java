package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class FirstAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_song_list);

        ArrayList<Song> songItem = new ArrayList<Song>();
        songItem.add(new Song("Alive and Well", R.drawable.first_album));
        songItem.add(new Song("My Life Inside Your Heart", R.drawable.first_album));
        songItem.add(new Song("Great Awakening", R.drawable.first_album));
        songItem.add(new Song("Six Ways 'Til Sunday", R.drawable.first_album));
        songItem.add(new Song("401 Kill", R.drawable.first_album));
        songItem.add(new Song("The Art of Losing", R.drawable.first_album));
        songItem.add(new Song("Remains of Summer Memories", R.drawable.first_album));
        songItem.add(new Song("The Unraveling", R.drawable.first_album));
        songItem.add(new Song("Reception Fades", R.drawable.first_album));
        songItem.add(new Song("Stained Glass and Marble", R.drawable.first_album));
        songItem.add(new Song("Everchanging", R.drawable.first_album));
        songItem.add(new Song("Sometimes Selling Out Is Giving Up", R.drawable.first_album));
        songItem.add(new Song("3 Day Weekend", R.drawable.first_album));
        songItem.add(new Song("1000 Good Intentions", R.drawable.first_album));
        songItem.add(new Song("Weight of Time", R.drawable.first_album));
        songItem.add(new Song("Faint Resemblance", R.drawable.first_album));

    }
}
