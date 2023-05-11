package com.zavierdev.whatsanimal;

public class Binatang {
    private String nama;
    private String detail;
    private String klasifikasi;
    private int photo;
    private int suara;

    public int getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }

    public String getKlasifikasi() {
        return klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
