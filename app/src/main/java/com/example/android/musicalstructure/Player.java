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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_item);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Intent intent = getIntent();
        ArrayList<Songs> songsList = intent.getParcelableArrayListExtra("SONGS_ARRAY");

        Songs test = intent.getParcelableExtra("EXAMPLE");

        String string = test.songName;
        int id = test.albumImage;

        TextView textView = findViewById(R.id.song_name);
        textView.setText(string);

        ImageView imageView = findViewById(R.id.album_image);
        imageView.setImageResource(id);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

}
