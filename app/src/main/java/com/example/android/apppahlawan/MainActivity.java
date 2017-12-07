package com.example.android.apppahlawan;

import android.app.WallpaperManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mywallpaper = (ImageView) findViewById(R.id.cover_pahlawan);
        mywallpaper.setImageResource(R.drawable.cover_pahlawan);

        Button pahlawanButton = (Button) findViewById(R.id.pahlawan);

        pahlawanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pahlawanIntent = new Intent(MainActivity.this, Pahlawan.class);
                startActivity(pahlawanIntent);
            }
        });

        Button quotesButton = (Button) findViewById(R.id.quotes);
        quotesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quotesIntent = new Intent(MainActivity.this, Quotes.class);
                startActivity(quotesIntent);
            }
        });
    }
}
