package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout firstRow = findViewById(R.id.first_row);
        RelativeLayout secondRow = findViewById(R.id.second_row);
        RelativeLayout thirdRow = findViewById(R.id.third_row);
        RelativeLayout fourthRow = findViewById(R.id.fourth_row);
        RelativeLayout fifthRow = findViewById(R.id.fifth_row);
        RelativeLayout sixthRow = findViewById(R.id.sixth_row);
        RelativeLayout seventhRow = findViewById(R.id.seventh_row);
        RelativeLayout eighthRow = findViewById(R.id.eighth_row);

        firstRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        secondRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        thirdRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        fourthRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        fifthRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        sixthRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        seventhRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        eighthRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });

        fourthRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FirstAlbum.class);

                startActivity(numbersIntent);
            }
        });
    }
}
