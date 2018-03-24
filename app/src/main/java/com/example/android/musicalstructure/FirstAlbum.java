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

        final Songs[] songsList = {
                new Songs("Alive and Well", R.drawable.first_album),
                new Songs("My Life Inside Your Heart", R.drawable.first_album),
                new Songs("Great Awakening", R.drawable.first_album),
                new Songs("Six Ways 'Til Sunday", R.drawable.first_album),
                new Songs("401 Kill", R.drawable.first_album),
                new Songs("The Art of Losing", R.drawable.first_album),
                new Songs("Remains of Summer Memories", R.drawable.first_album),
                new Songs("The Unraveling", R.drawable.first_album),
                new Songs("Reception Fades", R.drawable.first_album),
                new Songs("Stained Glass and Marble", R.drawable.first_album),
                new Songs("Everchanging", R.drawable.first_album),
                new Songs("Sometimes Selling Out Is Giving Up", R.drawable.first_album),
                new Songs("3 Day Weekend", R.drawable.first_album),
                new Songs("1000 Good Intentions", R.drawable.first_album),
                new Songs("Weight of Time", R.drawable.first_album),
                new Songs("Faint Resemblance", R.drawable.first_album)
        };

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
