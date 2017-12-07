package com.example.android.apppahlawan.page;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.apppahlawan.R;
import com.example.android.apppahlawan.controller.PahlawanAdapter;
import com.example.android.apppahlawan.detail_pahlawan;
import com.example.android.apppahlawan.entity.Pahlawan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class PahlawanPage extends AppCompatActivity {
    private ImageView mPahlawanView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pahlawan);


        final ArrayList<Pahlawan> arrayPahlawan = new ArrayList<Pahlawan>();
        arrayPahlawan.add(new Pahlawan("Soekarno", "6 Juni 1901", "21 Juni 1970", "Pahlawan Kebanggan", R.drawable.soekarno));
        arrayPahlawan.add(new Pahlawan("Sisingamangaraja", "1849", "17 Juni 1907", "Pahlawan Anti Takut", R.drawable.sisingamangaraja));

        PahlawanAdapter adapterPahlawan = new PahlawanAdapter(this, arrayPahlawan);
        ListView listView = (ListView) findViewById(R.id.list_pahlawan);
        listView.setAdapter(adapterPahlawan);

        mPahlawanView = (ImageView) findViewById(R.id.foto_pahlawan_view);
        mPahlawanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), detail_pahlawan.class);
                TextView namaPahlawan = (TextView) findViewById(R.id.nama_pahlawan_view);
                i.putExtra("nama_pahlawan", namaPahlawan.getText().toString());

                startActivity(i);
            }
        });
    }
}
