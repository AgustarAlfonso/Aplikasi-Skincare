package com.example.aplikasiskincare;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;



public class Info implements Parcelable {

    public String nama;
    public String harga;
    public String status;
    public String deskripsi;
    public String gambar;

    public Info() {
    }

    protected Info(Parcel in) {
        nama = in.readString();
        harga = in.readString();
        status = in.readString();
        deskripsi = in.readString();
        gambar = in.readString();
    }

    public static final Creator<Info> CREATOR = new Creator<Info>() {
        @Override
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        @Override
        public Info[] newArray(int size) {
            return new Info[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(harga);
        dest.writeString(status);
        dest.writeString(deskripsi);
        dest.writeString(gambar);
    }
}
