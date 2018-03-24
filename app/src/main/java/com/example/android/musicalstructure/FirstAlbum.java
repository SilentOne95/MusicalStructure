package com.example.android.musicalstructure;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        String titles[] = new String[16];
        titles[0] = "Alive and Well";
        titles[1] = "My Life Inside Your Heart";
        titles[2] = "Great Awakening";
        titles[3] = "Six Ways 'Til Sunday";
        titles[4] = "401 Kill";
        titles[5] = "The Art of Losing";
        titles[6] = "Remains of Summer Memories";
        titles[7] = "The Unraveling";
        titles[8] = "Reception Fades";
        titles[9] = "Stained Glass and Marble";
        titles[10] = "Everchanging";
        titles[11] = "Sometimes Selling Out Is Giving Up";
        titles[12] = "3 Day Weekend";
        titles[14] = "1000 Good Intentions";
        titles[15] = "Weight of Time";
        titles[16] = "Faint Resemblance";

        final ArrayList<Songs> songsList = new ArrayList<>();

        for(int i = 0; titles.length > i; i++){
            songsList.add(new Songs(titles[i], R.drawable.second_album));
        }

        GridSongsAdapter adapter = new GridSongsAdapter(this, songsList);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);

        gridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(FirstAlbum.this, Player.class);
                playerIntent.putParcelableArrayListExtra("TEST", songsList);

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
