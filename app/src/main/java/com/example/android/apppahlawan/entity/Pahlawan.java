package com.example.android.apppahlawan.entity;

import java.util.Date;

public class Pahlawan {
    private String nama;
    private Date tanggalLahir;
    private Date tanggalMeninggal;
    private String biografiSingkat;
    private int fotoId;

    public Pahlawan(String nama, Date tanggalLahir, Date tanggalMeninggal, String biografiSingkat, int fotoId) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tanggalMeninggal = tanggalMeninggal;
        this.biografiSingkat = biografiSingkat;
        this.fotoId = fotoId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalMeninggal() {
        return tanggalMeninggal;
    }

    public void setTanggalMeninggal(Date tanggalMeninggal) {
        this.tanggalMeninggal = tanggalMeninggal;
    }

    public String getBiografiSingkat() {
        return biografiSingkat;
    }

    public void setBiografiSingkat(String biografiSingkat) {
        this.biografiSingkat = biografiSingkat;
    }

    public int getFotoId() {
        return fotoId;
    }

    public void setFotoId(int fotoId) {
        this.fotoId = fotoId;
    }

}
