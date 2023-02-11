package com.func.selskap;

public class Bil {
    private int registreringNr;
    private String farge;
    private boolean status;
    private String merke;
    private String model;
    private int kmStand;
    Katagori katagori;

    public Bil(int registreringNr, String farge, boolean status, String merke, String model, int kmStand, Katagori katagori) {
        this.registreringNr = registreringNr;
        this.farge = farge;
        this.status = status;
        this.merke = merke;
        this.model = model;
        this.kmStand = kmStand;
        this.katagori = katagori;
    }

    public int getKmStand() {
        return kmStand;
    }

    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }

    public Katagori getKatagori() {
        return katagori;
    }

    public void setKatagori(Katagori katagori) {
        this.katagori = katagori;
    }


    public int getRegistreringNr() {
        return registreringNr;
    }

    public void setRegistreringNr(int registreringNr) {
        this.registreringNr = registreringNr;
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String fage) {
        this.farge = fage;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "" +
                " farge='" + farge + '\'' +
                ", status=" + status +
                ", merke='" + merke + '\'' +
                ", model='" + model + '\'' +
                ", kmStand=" + kmStand +
                ", katagori=" + katagori +
                "";
    }
}

