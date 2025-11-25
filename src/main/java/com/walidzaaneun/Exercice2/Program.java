package com.walidzaaneun.Exercice2;

public class Program {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture("Dacia",120000,"Logan",2020);
        Vehicule moto = new Moto("Kawasaki",200000,"Z700",80);
        Vehicule avion = new Avion("Boeing",1000000000,"797",900);

        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();

        System.out.println(voiture.afficherInformations());
        System.out.println(moto.afficherInformations());
        System.out.println(avion.afficherInformations());
    }
}
