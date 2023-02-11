package com.func.selskap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Selskap {
    private String navn;
    private String telefon;

   private List<Kontor> kontorer;
   private List<Kunde> kunder;
   private List<Resevasjon> resevasjoner;
   private Soek soek;

    public Selskap(String navn, String telefon,List<Kontor> kontorer) {
        this.navn = navn;
        this.telefon = telefon;
        this.kontorer = kontorer;
        this.kunder = new ArrayList<>();
        this.resevasjoner = new ArrayList<>();
        soek = new Soek();
    }

    public String soekSted(String sted, String utlaanDato, String returdato, String utlaanKlokkeslett, String returdatoKlokkeslett) {


        soek.setUtleiested(sted);
        soek.getDato().setUtlannDato(utlaanDato);
        soek.getDato().setReturdato(returdato);
        soek.getDato().setUtlannKlokkeslett(utlaanKlokkeslett);
        soek.getDato().setReturklokkeslett(returdatoKlokkeslett);

       return sokBiler(sted);
    }

    private String sokBiler(String sted) {

        String resultat = "";
        Kontor by = null;
        List<Bil> biler = null;

        for (int i = 0; i < kontorer.size(); i++) {

            if (kontorer.get(i).getAdresse().getPoststed().equals(sted)) {
                by = kontorer.get(i);
                break;
            } else {
                resultat = "Vi har ingen biler i stedet du søkte på";
                return resultat;
            }
        }

        biler = by.getAlleBiler();
        for (int i = 0; i < biler.size(); i++) {

            if (biler.get(i).getStatus()) {
                resultat +=  biler.get(i)+"\n";
            }
        }
        return "Tilgjengelige biler: \n" + resultat;
    }

    public String reserver(Bil bil, Kunde kunde) throws ParseException {
        int antallDager =(int) dagKalkulator(soek.getDato().getUtlannDato(),soek.getDato().getReturdato());
        int id = idGenerator(kunde.getTelefon(),soek.getDato().getUtlannDato());

        kunde.getResevasjon().setId(id);
        kunde.getResevasjon().setDato(soek.getDato());
        kunde.getResevasjon().setBil(bil);
        kunde.getResevasjon().setAntallDager(antallDager);
        kunde.getResevasjon().setPris(prisKalkulator(bil,antallDager));
        bil.setStatus(false);

        kunder.add(kunde);
        resevasjoner.add(kunde.getResevasjon());


        return kunde.getResevasjon().toString();
    }

    public String returner(String sted,Kunde kunde) {

        // finner kunden

        for (int i = 0; i < resevasjoner.size(); i++) {
            if (resevasjoner.get(i).getId() == kunde.getResevasjon().getId()){
                resevasjoner.remove(resevasjoner.get(i));
                break;
            }
        }
        // updaterer klomter standen til bilen

        for (int i = 0; i < kontorer.size(); i++) {
            if ((kontorer.get(i)).getAdresse().getPoststed().equals(sted)) {
                for (int j = 0; j < kontorer.get(i).getAlleBiler().size(); j++) {
                    if (kontorer.get(i).getAlleBiler().get(j).getRegistreringNr() == kunde.getResevasjon().getBil().getRegistreringNr()) {
                        kontorer.get(i).getAlleBiler().get(j).setStatus(true);
                        kontorer.get(i).getAlleBiler().get(j).setKmStand(kunde.getResevasjon().getBil().getKmStand());
                        break;
                    }
                }
                break;
            }
        }
        // utsteder regning

        kunde.getRegning().setSum(prisKalkulator(kunde.getResevasjon().getBil(), kunde.getResevasjon().getAntallDager()));
        kunde.getRegning().setKlokkeslett(kunde.getResevasjon().getDato().getReturklokkeslett());
        kunde.getRegning().setDato(kunde.getResevasjon().getDato());
        kunde.getRegning().setKredittkortNr(kunde.getKredittkort().getNummer());
        kunde.setResevasjon(null);


        return kunde.getRegning().toString();
    }

    private long dagKalkulator(String startDato, String sluttDato) throws ParseException {

        //Date start = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(startDato);
        //Date slutt = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(sluttDato);

        Date start = new SimpleDateFormat("dd/mm/yyyy").parse(startDato);
        Date slutt = new SimpleDateFormat("dd/mm/yyyy").parse(sluttDato);

        long ml =  slutt.getTime() -start.getTime();
        long dager = ml/(24*60*60*1000);

    return dager;
    }

    private double prisKalkulator(Bil bil, int antallDager) {
        double pris = 0;
        if (bil.getKatagori() == Katagori.A) {
            return antallDager * 500;
        } else if (bil.getKatagori() == Katagori.B) {
            return antallDager * 400;
        } else if (bil.getKatagori() == Katagori.C) {
            return antallDager * 700;
        }
        return antallDager * 900;
    }

    private int idGenerator(String kundeTelefon,String utlansDato) throws ParseException {

        Date dato = new SimpleDateFormat("dd/mm/yyyy").parse(utlansDato);
        Random rand = new Random();
        int max = (int) dato.getTime()/1000;
        int min = Integer.parseInt(kundeTelefon)/4;
        int id = (int)Math.floor(Math.random() * (max - min + 1) + min);

        return id;
    }

}
