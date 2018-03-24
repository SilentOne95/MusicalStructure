package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class ThirdAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[12];
        titles[0] = "State of the Union";
        titles[1] = "The First Drop";
        titles[2] = "Life Less Frightening";
        titles[3] = "Paper Wings";
        titles[4] = "Blood to Bleed";
        titles[5] = "To Them These Streets Belong";
        titles[6] = "Tip the Scales";
        titles[7] = "Anywhere but Here";
        titles[8] = "Give It All";
        titles[9] = "Dancing for Rain";
        titles[10] = "Swing Life Away";
        titles[11] = "Rumors of My Demise";

        ArrayList<Songs> songsList = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songsList.add(new Songs(titles[i], R.drawable.second_album));
        }

        GridSongsAdapter adapter = new GridSongsAdapter(this, songsList);
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
