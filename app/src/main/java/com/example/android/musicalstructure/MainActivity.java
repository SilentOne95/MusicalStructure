package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views and instantiate Id's.
        final RelativeLayout firstRow = findViewById(R.id.first_row);
        firstRow.setOnClickListener(this);
        final RelativeLayout secondRow = findViewById(R.id.second_row);
        secondRow.setOnClickListener(this);
        final RelativeLayout thirdRow = findViewById(R.id.third_row);
        thirdRow.setOnClickListener(this);
        final RelativeLayout fourthRow = findViewById(R.id.fourth_row);
        fourthRow.setOnClickListener(this);
    }

    // This listeners gets triggered whenever Album List is clicked.
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.first_row:
                startActivity(new Intent(MainActivity.this, FirstAlbum.class));
                break;

            case R.id.second_row:
                startActivity(new Intent(MainActivity.this, SecondAlbum.class));
                break;

            case R.id.third_row:
                startActivity(new Intent(MainActivity.this, ThirdAlbum.class));
                break;

            case R.id.fourth_row:
                startActivity(new Intent(MainActivity.this, FourthAlbum.class));
                break;

            default:
                break;
        }
    }

}
