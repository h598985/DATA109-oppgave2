package com.func.selskap;

public class Resevasjon {
    private int id;
    private String kundeTelefon;
    Dato dato;
    private int antallDager;
    private double pris;
    Bil bil;

    public String getKundeTelefon() {
        return kundeTelefon;
    }

    public void setKundeTelefon(String kundeTelefon) {
        this.kundeTelefon = kundeTelefon;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }

    public int getAntallDager() {
        return antallDager;
    }

    public void setAntallDager(int antallDager) {
        this.antallDager = antallDager;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Din resevasjons detalj: \n" +
                " Id: " + id +"\n"+
                " Dato: " + dato.toString() +"\n"+
                " Antall dager: " + antallDager +"\n"+
                " Total: " + pris +"kr \n"+
                " Bil: " + bil.toString() +
                ""
                ;
    }
}
