package com.func.selskap;

public class Regning {
    private Dato dato;
    private String klokkeslett;
    private double sum;
    private String kredittkortNr;

    public String getKredittkortNr() {
        return kredittkortNr;
    }

    public void setKredittkortNr(String kredittkortNr) {
        this.kredittkortNr = kredittkortNr;
    }

    public Regning(){

    }

    public double getSum() {
        return sum;
    }

    public void setSum(double regning) {
        this.sum = regning;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public String getKlokkeslett() {
        return klokkeslett;
    }

    public void setKlokkeslett(String klokkeslett) {
        this.klokkeslett = klokkeslett;
    }

    @Override
    public String toString() {
        return "Din regnig: \n" +
                " Dato: " + dato.getReturdato() + "\n" +
                " klokka: " + klokkeslett + "\n" +
                " Total: " + sum + "kr" + "\n" +
                " KredittkortNr: " + kredittkortNr;
    }
}
