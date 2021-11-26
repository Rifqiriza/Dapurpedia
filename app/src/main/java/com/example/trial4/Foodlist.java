package com.example.trial4;

import android.content.Intent;

public class Foodlist {
    private String namaMakanan, angkaRating;
    private Integer gambarMakanan;


    public Foodlist(String namaMakanan, String angkaRating, Integer gambarMakanan) {
        this.namaMakanan = namaMakanan;
        this.angkaRating = angkaRating;
        this.gambarMakanan = gambarMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getAngkaRating() {
        return angkaRating;
    }

    public void setAngkaRating(String angkaRating) {
        this.angkaRating = angkaRating;
    }

    public Integer getGambarMakanan() {
        return gambarMakanan;
    }

    public void setGambarMakanan(Integer gambarMakanan) {
        this.gambarMakanan = gambarMakanan;
    }
}