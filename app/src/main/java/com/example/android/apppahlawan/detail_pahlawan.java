package com.example.android.apppahlawan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detail_pahlawan extends AppCompatActivity {
    private TextView mNamaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pahlawan);

        mNamaView = (TextView) findViewById(R.id.nama_pahlawan);
        Intent i = getIntent();
        String namaPahlawan = i.getStringExtra("nama_pahlawan");
        mNamaView.setText(namaPahlawan);
    }
}
