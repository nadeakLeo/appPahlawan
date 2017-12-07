package com.example.android.apppahlawan.page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.apppahlawan.R;

public class DetailPahlawan extends AppCompatActivity {
    private TextView mNamaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pahlawan);

        mNamaView = (TextView) findViewById(R.id.nama_pahlawan);
        TextView mLahirPahlawan = (TextView) findViewById(R.id.lahir_pahlawan);
        TextView mMeninggalPahlawan = (TextView) findViewById(R.id.meninggal_pahlawan);
        TextView mBiografiPahlawan = (TextView) findViewById(R.id.biografi_pahlawan);
        ImageView mFoto = (ImageView) findViewById(R.id.foto_pahlawan);

        Intent i = getIntent();
        String namaPahlawan = i.getStringExtra("nama_pahlawan");
        String lahirPahlawan = i.getStringExtra("lahir_pahlawan");
        String meninggalPahlawan = i.getStringExtra("meninggal_pahlawan");
        String biografiPahlawan = i.getStringExtra("biografi_pahlawan");
        int foto = i.getIntExtra("foto_pahlawan", 0);
        mNamaView.setText(namaPahlawan);
        mLahirPahlawan.setText(lahirPahlawan);
        mMeninggalPahlawan.setText(meninggalPahlawan);
        mBiografiPahlawan.setText(biografiPahlawan);
        mFoto.setImageResource(foto);

    }
}
