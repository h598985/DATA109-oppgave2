package com.func.selskap;

import java.io.Serial;

public class Kunde {
    private String fornavn;
    private String etternavn;
    private String telefon;
    private Adresse adresse;
    private Resevasjon resevasjon;
    private Regning regning;
    private Kredittkort kredittkort;

    public Kunde(String fornavn, String etternavn, String telefon, Adresse adresse, Kredittkort kredittkort) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.adresse = adresse;
        resevasjon = new Resevasjon();
        regning = new Regning();
        this.kredittkort = kredittkort;
    }

    public Regning getRegning() {
        return regning;
    }

    public void setRegning(Regning regning) {
        this.regning = regning;
    }

    public Kredittkort getKredittkort() {
        return kredittkort;
    }

    public void setKredittkort(Kredittkort kredittkort) {
        this.kredittkort = kredittkort;
    }

    public Resevasjon getResevasjon() {
        return resevasjon;
    }

    public void setResevasjon(Resevasjon resevasjon) {
        this.resevasjon = resevasjon;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Kunde() {
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
