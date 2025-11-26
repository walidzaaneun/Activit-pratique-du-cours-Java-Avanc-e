package com.walidzaaneun.Exercice5;

public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean etatEmprunt;

    public Livre(String titre, String auteur, boolean etatEmprunt) {
        this.titre = titre;
        this.auteur = auteur;
        this.etatEmprunt = etatEmprunt;
    }

    @Override
    public void emprunter() {
        if (etatEmprunt) {
            System.out.println("Le livre est deja emprunté");
        }else{
            this.etatEmprunt = true;
            System.out.println("Le livre est emprunté");
        }
    }

    @Override
    public void retourner() {
        if (!etatEmprunt) {
            System.out.println("Le livre est deja retourné");
        }else{
            this.etatEmprunt = false;
            System.out.println("Le livre est retourné");
        }
    }
}
