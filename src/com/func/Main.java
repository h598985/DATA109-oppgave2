package com.func;

import com.func.selskap.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        Adresse adresse1 = new Adresse("Gate1",204,"Bergen");
        Adresse adresse2 = new Adresse("Gate2",504,"Bergen");
        Adresse adresse3 = new Adresse("Gate3",350,"Oslo");
        Adresse adresse4 = new Adresse("Bergate3",3540,"Oslo");



        Bil bil1 = new Bil(25,"Svart",true,"BMW","B19",100,Katagori.A);
        Bil bil2 = new Bil(20,"Svart",true,"Nisan","A19",110,Katagori.B);
        Bil bil3 = new Bil(235,"Hvit",true,"Tesla","C30",150,Katagori.C);
        Bil bil4 = new Bil(225,"Rød",true,"BMW","B1",10,Katagori.D);
        List<Bil> biler1 = new ArrayList<>();
        biler1.add(bil1);
        biler1.add(bil2);
        biler1.add(bil3);
        biler1.add(bil4);

        List<Bil> biler2 = new ArrayList<>();
        biler2.add(bil1);
        biler2.add(bil2);


        Kontor kontor1 = new Kontor(9012,"24359034",adresse1,biler1);
        Kontor kontor2 = new Kontor(1012,"24359045",adresse2,biler2);

        List<Kontor> kontorer = new ArrayList<>();
        kontorer.add(kontor1);
        kontorer.add(kontor2);

        Selskap selskap = new Selskap("Nixan", "232343",kontorer);

        String resultat = selskap.soekSted("Bergen","12/2/20","14/2/20","1:25","2:20");

        System.out.println(resultat);

        System.out.println("---------------------------");

        System.out.println("Jeg vil reservere bil A");

        Kredittkort kort1 = new Kredittkort(4321, "986700223311");
        Kunde kunde1 = new Kunde("Lars","Larsen","77789901",adresse4,kort1);

        String kvittering = selskap.reserver(bil1,kunde1);

        System.out.println(kvittering);
        System.out.println("---------------------------");

        System.out.println("Jeg vil returnere bilen");
        System.out.println("---------------------------");
        String regning = selskap.returner("Bergen", kunde1);

        System.out.println(regning);

    }

}
