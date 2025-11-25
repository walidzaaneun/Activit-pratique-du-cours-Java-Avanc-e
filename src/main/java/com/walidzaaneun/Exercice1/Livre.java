package com.walidzaaneun.Exercice1;

public class Livre {
    private String ISBN;
    private String titre;
    private Auteur auteur;

    public Livre(String ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "ISBN=" + ISBN +
                ", titre='" + titre +
                ", auteur= (" + auteur +")";
    }
}
