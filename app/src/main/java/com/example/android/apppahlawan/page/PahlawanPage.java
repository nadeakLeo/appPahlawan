package com.example.android.apppahlawan.page;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.apppahlawan.R;
import com.example.android.apppahlawan.control.PahlawanControl;
import com.example.android.apppahlawan.entity.PahlawanAdapter;

import com.example.android.apppahlawan.entity.Pahlawan;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class PahlawanPage extends AppCompatActivity {
    private ImageView mPahlawanView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pahlawan);

        PahlawanControl pc = new PahlawanControl();

        final ArrayList<Pahlawan> arrayPahlawan = pc.getListPahlawan();
        PahlawanAdapter adapterPahlawan = new PahlawanAdapter(this, arrayPahlawan);
        ListView listView = (ListView) findViewById(R.id.list_pahlawan);
        listView.setAdapter(adapterPahlawan);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent profilPahlawanIntent = new Intent(PahlawanPage.this, DetailPahlawan.class);
                Pahlawan pahlawan = arrayPahlawan.get(i);

                profilPahlawanIntent.putExtra("nama_pahlawan", pahlawan.getNama());
                profilPahlawanIntent.putExtra("lahir_pahlawan", pahlawan.getTanggalLahir());
                profilPahlawanIntent.putExtra("meninggal_pahlawan", pahlawan.getTanggalMeninggal());
                profilPahlawanIntent.putExtra("biografi_pahlawan", pahlawan.getBiografiSingkat());
                profilPahlawanIntent.putExtra("foto_pahlawan", pahlawan.getFotoId());

                startActivity(profilPahlawanIntent);
            }
        });
//        View inflatedview = getLayoutInflater().inflate(R.layout.list_pahlawan, null);
//        mPahlawanView = (ImageView) inflatedview.findViewById(R.id.foto_pahlawan_view);
//        mPahlawanView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(PahlawanPage.this, DetailPahlawan.class);
//                TextView namaPahlawan = (TextView) findViewById(R.id.nama_pahlawan_view);
//                i.putExtra("nama_pahlawan", namaPahlawan.getText().toString());

//                startActivity(i);
//            }
//        });
    }
}
