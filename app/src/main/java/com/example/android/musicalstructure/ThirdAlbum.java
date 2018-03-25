package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
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

        //Adding song titles to the Array
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

        // Creating new Array of Songs and store song titles and images using loop
        final ArrayList<Songs> songsList = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songsList.add(new Songs(titles[i], R.drawable.third_album));
        }

        // Setting adapter to print out all song titles as new activity is started
        GridSongsAdapter adapter = new GridSongsAdapter(this, songsList);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);

        // Tracking which item was selected, starting new activity and passing the array
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playerIntent = new Intent(ThirdAlbum.this, Player.class);
                playerIntent.putParcelableArrayListExtra("SONGS_ARRAY", songsList);

                startActivity(playerIntent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

}
