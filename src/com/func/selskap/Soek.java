package com.func.selskap;

import java.util.List;

public class Soek {

    private String utleiested;
    Dato dato;

    public Soek() {
        this.utleiested = null;
        this.dato = new Dato();
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public String getUtleiested() {
        return utleiested;
    }

    public void setUtleiested(String utleiested) {
        this.utleiested = utleiested;
    }

}
