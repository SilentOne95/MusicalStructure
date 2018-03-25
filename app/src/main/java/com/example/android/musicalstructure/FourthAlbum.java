package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class FourthAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        //Adding song titles to the Array
        String titles[] = new String[14];
        titles[0] = "Chamber the Cartridge";
        titles[1] = "Injection";
        titles[2] = "Ready to Fall";
        titles[3] = "Bricks";
        titles[4] = "Under the Knife";
        titles[5] = "Prayer of the Refugee";
        titles[6] = "Drones";
        titles[7] = "The Approaching Curve";
        titles[8] = "Worth Dying For";
        titles[9] = "Behind Closed Doors";
        titles[10] = "Roadside";
        titles[11] = "Good Left Undone";
        titles[12] = "Survive";
        titles[13] = "Built to Last";

        // Creating new Array of Songs and store song titles and images using loop
        final ArrayList<Songs> songsList = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songsList.add(new Songs(titles[i], R.drawable.fourth_album));
        }

        // Setting adapter to print out all song titles as new activity is started
        GridSongsAdapter adapter = new GridSongsAdapter(this, songsList);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);

        // Tracking which item was selected, starting new activity and passing the array
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playerIntent = new Intent(FourthAlbum.this, Player.class);
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
