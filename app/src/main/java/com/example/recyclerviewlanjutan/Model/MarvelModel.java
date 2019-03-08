package com.example.recyclerviewlanjutan.Model;

import android.graphics.drawable.Drawable;

public class MarvelModel {
    String name;
    int gambar;
    String overview;



    public MarvelModel(String name, int gambar, String overview) {
        this.name = name;
        this.gambar = gambar;
        this.overview = overview;
    }

    public int getGambar() {
        return gambar;
    }

    public String getName() { // get data name dalam bentuk stirng
        return name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) { this.overview = overview; }
}
