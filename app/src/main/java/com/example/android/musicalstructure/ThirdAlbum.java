package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ThirdAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        ArrayList<Song> songItem = new ArrayList<>();
        songItem.add(new Song("State of the Union", R.drawable.third_album));
        songItem.add(new Song("The First Drop", R.drawable.third_album));
        songItem.add(new Song("Life Less Frightening", R.drawable.third_album));
        songItem.add(new Song("Paper Wings", R.drawable.third_album));
        songItem.add(new Song("Blood to Bleed", R.drawable.third_album));
        songItem.add(new Song("To Them These Streets Belong", R.drawable.third_album));
        songItem.add(new Song("Tip the Scales", R.drawable.third_album));
        songItem.add(new Song("AnyWhere but Here", R.drawable.third_album));
        songItem.add(new Song("Give It All", R.drawable.third_album));
        songItem.add(new Song("Dancing for Rain", R.drawable.third_album));
        songItem.add(new Song("Swing Life Away", R.drawable.third_album));
        songItem.add(new Song("Rumors of My Demise", R.drawable.third_album));

        GridSongAdapter adapter = new GridSongAdapter(this, songItem);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
