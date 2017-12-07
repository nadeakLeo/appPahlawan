package com.example.android.apppahlawan.page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.apppahlawan.R;

public class DetailPahlawan extends AppCompatActivity {
    private TextView mNamaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pahlawan);

        mNamaView = (TextView) findViewById(R.id.nama_pahlawan);
        Intent i = getIntent();
//        String namaPahlawan = i.getStringExtra("nama_pahlawan");
//        mNamaView.setText(namaPahlawan);
    }
}
