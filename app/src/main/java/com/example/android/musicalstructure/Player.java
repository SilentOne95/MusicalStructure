package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Player extends AppCompatActivity {

    TextView name;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_item);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // Get the intent from first album
        Intent intent = getIntent();
        Songs myChoice = intent.getParcelableExtra("listSong");

        // Initialize the string
        String titleSong = myChoice.getSongName();
        int imageAlbum = myChoice.getAlbumImage();

        // Initialize the view and set data
        name = findViewById(R.id.song_name);
        name.setText(titleSong);

        // Initialize the view and set data
        image = findViewById(R.id.album_image);
        image.setImageResource(imageAlbum);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

}
