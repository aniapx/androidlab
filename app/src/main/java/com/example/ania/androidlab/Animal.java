package com.example.ania.androidlab;

import java.io.Serializable;

/**
 * Created by Ania on 27.04.2018.
 */

public class Animal implements Serializable {
    private int _id;
    private String kolor;
    private String gatunek;
    private float wielkosc;
    private String opis;

    public Animal(){}

    public Animal(String kolor, String gatunek, float wielkosc, String opis) {
        this.kolor = kolor;
        this.gatunek = gatunek;
        this.wielkosc = wielkosc;
        this.opis = opis;
    }

    @Override
    public String toString(){
        return  "Zwierze: [id=" + _id + ", gatunek=" + gatunek + ", kolor=" + kolor + ", wielkosc=" + wielkosc + " ]";
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getKolor() {
        return kolor;
    }

    public String getGatunek() {
        return gatunek;
    }

    public float getWielkosc() {
        return wielkosc;
    }

    public String getOpis() {
        return opis;
    }
}
