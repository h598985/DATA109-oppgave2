package com.func.selskap;

public class Adresse {
    private String gateadresse;
    private int postnummer;
    private String poststed;

    public Adresse(String gateadresse, int postnummer, String poststed) {
        this.gateadresse = gateadresse;
        this.postnummer = postnummer;
        this.poststed = poststed;
    }

    public String getGateadresse() {
        return gateadresse;
    }

    public void setGateadresse(String gateadresse) {
        this.gateadresse = gateadresse;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getPoststed() {
        return poststed;
    }

    public void setPoststed(String poststed) {
        this.poststed = poststed;
    }
}
