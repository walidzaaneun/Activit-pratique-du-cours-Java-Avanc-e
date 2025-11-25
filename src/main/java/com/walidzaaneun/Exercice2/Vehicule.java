package com.walidzaaneun.Exercice2;

public class Vehicule {
    private String nom;
    private double prix;

    public void emettreSon(){
        System.out.println("son inconnu");
    }

    public String afficherInformations(){
        return  "Nom =" + nom + ", Prix =" + prix;
    }

    public Vehicule(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }
}
