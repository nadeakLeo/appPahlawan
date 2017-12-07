package com.example.android.apppahlawan.entity;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.apppahlawan.R;
import com.example.android.apppahlawan.entity.Pahlawan;

import java.util.ArrayList;
import java.util.List;

public class PahlawanAdapter extends ArrayAdapter<Pahlawan> {
    public PahlawanAdapter(Activity context, ArrayList<Pahlawan> arrayPahlawan) {
        super(context, 0, arrayPahlawan);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemsView = convertView;
        if (convertView == null){
            itemsView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_pahlawan, parent, false);
        }
        Pahlawan pahlawan = getItem(position);

        ImageView fotoPahlawanView = (ImageView) itemsView.findViewById(R.id.foto_pahlawan_view);
        if (pahlawan.getFotoId() == -1){
            fotoPahlawanView.setVisibility(View.GONE);
        }
        else{
            fotoPahlawanView.setImageResource(pahlawan.getFotoId());
            fotoPahlawanView.setVisibility(View.VISIBLE);
        }

        TextView namaPahlawanView = (TextView) itemsView.findViewById(R.id.nama_pahlawan_view);
        namaPahlawanView.setText(pahlawan.getNama());

        String tanggalPahlawan = pahlawan.getTanggalLahir()+" - "+pahlawan.getTanggalMeninggal();
        TextView tanggalPahlawanView = (TextView) itemsView.findViewById(R.id.tanggal_pahlawan_view);
        tanggalPahlawanView.setText(tanggalPahlawan);

        return itemsView;
    }


}
