package com.func.selskap;

public class Dato {
    private String utlannDato;
    private String returdato;
    private String utlannKlokkeslett;
    private String returklokkeslett;

    public Dato(String utlannDato, String returdato, String utlannKlokkeslett, String returklokkeslett) {
        this.utlannDato = utlannDato;
        this.returdato = returdato;
        this.utlannKlokkeslett = utlannKlokkeslett;
        this.returklokkeslett = returklokkeslett;
    }

    public Dato(){

    }

    public String getUtlannDato() {
        return utlannDato;
    }

    public void setUtlannDato(String utlannDato) {
        this.utlannDato = utlannDato;
    }

    public String getReturdato() {
        return returdato;
    }

    public void setReturdato(String returdato) {
        this.returdato = returdato;
    }

    public String getUtlannKlokkeslett() {
        return utlannKlokkeslett;
    }

    public void setUtlannKlokkeslett(String utlannKlokkeslett) {
        this.utlannKlokkeslett = utlannKlokkeslett;
    }

    public String getReturklokkeslett() {
        return returklokkeslett;
    }

    public void setReturklokkeslett(String returklokkeslett) {
        this.returklokkeslett = returklokkeslett;
    }


    @Override
    public String toString() {
        return "" +
                " UtlånsDato: " + utlannDato +"\n"+
                " Returdato: " + returdato +"\n"+
                " Utlån klokkeslett: " + utlannKlokkeslett +"\n"+
                " Retur klokkeslett: " + returklokkeslett  + "";
    }
}
