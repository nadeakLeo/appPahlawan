package com.example.android.apppahlawan;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mywallpaper = (ImageView) findViewById(R.id.cover_pahlawan);
        mywallpaper.setImageResource(R.drawable.cover_pahlawan);
    }
}
