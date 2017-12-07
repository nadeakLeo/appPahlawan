package com.example.android.apppahlawan.control;

import com.example.android.apppahlawan.R;
import com.example.android.apppahlawan.entity.Pahlawan;
import com.example.android.apppahlawan.entity.PahlawanAdapter;

import java.util.ArrayList;

/**
 * Created by GE60 on 12/7/2017.
 */

public class PahlawanControl {

    public PahlawanControl() {
    }

    public ArrayList<Pahlawan> getListPahlawan(){
        ArrayList<Pahlawan> arrayPahlawan = new ArrayList<Pahlawan>();
        arrayPahlawan.add(new Pahlawan("Soekarno", "6 Juni 1901", "21 Juni 1970", "Pahlawan Kebanggan", R.drawable.soekarno));
        arrayPahlawan.add(new Pahlawan("Sisingamangaraja", "1849", "17 Juni 1907", "Pahlawan Anti Takut", R.drawable.sisingamangaraja));
        return arrayPahlawan;

    }
}
