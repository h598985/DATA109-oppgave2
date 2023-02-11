package com.func.selskap;

import java.util.ArrayList;
import java.util.List;

public class Kontor {
    private int registreringsNr;
    private String telefon;
    private Adresse adresse;
    private List<Bil> biler;

    public Kontor(int registreringsNr, String telefon, Adresse adresse, List<Bil> biler) {
        this.registreringsNr = registreringsNr;
        this.telefon = telefon;
        this.adresse = adresse;
        this.biler = biler;
    }

    public Kontor(List<Bil> biler) {
        this.biler = new ArrayList<>();
    }

    public void leggeTilBil(Bil bil) {
        biler.add(bil);
    }

    public List<Bil> getAlleBiler() {
        return biler;
    }

    public int getRegistreringsNr() {
        return registreringsNr;
    }

    public void setRegistreringsNr(int registreringsNr) {
        this.registreringsNr = registreringsNr;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
