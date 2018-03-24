package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views and instantiate Id's.
        RelativeLayout firstRow = findViewById(R.id.first_row);
        RelativeLayout secondRow = findViewById(R.id.second_row);
        RelativeLayout thirdRow = findViewById(R.id.third_row);
        RelativeLayout fourthRow = findViewById(R.id.fourth_row);

        // This listeners gets triggered whenever Album List is clicked.
        firstRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstAlbumIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(firstAlbumIntent);
            }
        });

        secondRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondAlbumIntent = new Intent(MainActivity.this, SecondAlbum.class);

                startActivity(secondAlbumIntent);
            }
        });

        thirdRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdAlbumIntent = new Intent(MainActivity.this, ThirdAlbum.class);

                startActivity(thirdAlbumIntent);
            }
        });

        fourthRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fourthAlbumIntent = new Intent(MainActivity.this, FourthAlbum.class);

                startActivity(fourthAlbumIntent);
            }
        });
    }
}
