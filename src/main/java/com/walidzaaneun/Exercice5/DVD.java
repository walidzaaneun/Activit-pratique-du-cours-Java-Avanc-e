package com.walidzaaneun.Exercice5;

public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean etatEmprunt;

    public DVD(String titre, String realisateur, boolean etatEmprunt) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.etatEmprunt = etatEmprunt;
    }

    @Override
    public void emprunter() {
        if (etatEmprunt) {
            System.out.println("Le DVD est deja emprunté");
        }else{
            this.etatEmprunt = false;
            System.out.println("Le DVD est emprunté");
        }
    }

    @Override
    public void retourner() {
        if (!etatEmprunt) {
            System.out.println("Le DVD est deja retourné");
        }else{
            this.etatEmprunt = false;
            System.out.println("Le DVD est retourné");
        }
    }
}
