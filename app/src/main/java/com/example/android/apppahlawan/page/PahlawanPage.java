package com.example.android.apppahlawan.page;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.apppahlawan.R;
import com.example.android.apppahlawan.control.PahlawanControl;
import com.example.android.apppahlawan.entity.PahlawanAdapter;
import com.example.android.apppahlawan.entity.Pahlawan;

import java.util.ArrayList;


public class PahlawanPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pahlawan);

        PahlawanControl pc = new PahlawanControl();

        final ArrayList<Pahlawan> arrayPahlawan = pc.getListPahlawan();
        PahlawanAdapter adapterPahlawan = new PahlawanAdapter(this, arrayPahlawan);
        ListView listView = (ListView) findViewById(R.id.list_pahlawan);
        listView.setAdapter(adapterPahlawan);

    }
}
