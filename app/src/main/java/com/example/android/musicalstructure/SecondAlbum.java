package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class SecondAlbum extends AppCompatActivity {

    // Creating new Array
    static final ArrayList<Songs> songsList = new ArrayList<>();
    private static String SONG_LIST = "listSong";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        //Adding song titles to the Array
        String titles[] = new String[13];
        titles[0] = "Black Masks and Gasoline";
        titles[1] = "Heaven Knows";
        titles[2] = "Dead Ringer";
        titles[3] = "Halfway There";
        titles[4] = "Like the Angel";
        titles[5] = "Voices Off Camera";
        titles[6] = "Blood-Red, White and Blue";
        titles[7] = "Broken English";
        titles[8] = "Last Chance Blueprint";
        titles[9] = "To the Core";
        titles[10] = "Torches";
        titles[11] = "Amber Changing";
        titles[12] = "Any Way You Want It";

        // Storing song titles and images using loop
        for(int i = 0; titles.length > i; i++){
            songsList.add(new Songs(titles[i], R.drawable.second_album));
        }

        // Setting adapter to print out all song titles as new activity is started
        GridSongsAdapter adapter = new GridSongsAdapter(this, songsList);
        final GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);

        // Tracking which item was selected, starting new activity and passing the array
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playerIntent = new Intent(SecondAlbum.this, Player.class);
                playerIntent.putExtra(SONG_LIST, getArrayList().get(position));
                startActivity(playerIntent);
            }
        });

    }

    public static ArrayList<Songs> getArrayList(){ return songsList; }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

}
