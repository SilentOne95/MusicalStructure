package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class FifthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[14];
        titles[0] = "Collapse";
        titles[1] = "Long Forgotten Sons";
        titles[2] = "Re-Education";
        titles[3] = "The Dirt Whispered";
        titles[4] = "Kotov Syndrome";
        titles[5] = "From Heads Unworthy";
        titles[6] = "The Strength to Go On";
        titles[7] = "Audience of One";
        titles[8] = "Entertainment";
        titles[9] = "Hero of War";
        titles[10] = "Savior";
        titles[11] = "Hairline Fracture";
        titles[12] = "Whereabouts Unknown";
        titles[13] = "Historia calamitatum";

        ArrayList<Song> songItem = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songItem.add(new Song(titles[i], R.drawable.fifth_album));
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
