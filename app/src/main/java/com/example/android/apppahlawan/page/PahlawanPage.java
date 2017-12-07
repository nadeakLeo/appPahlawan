package com.example.android.apppahlawan.page;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.apppahlawan.R;
import com.example.android.apppahlawan.controller.PahlawanAdapter;
import com.example.android.apppahlawan.entity.Pahlawan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class PahlawanPage extends AppCompatActivity {

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

    }
}
