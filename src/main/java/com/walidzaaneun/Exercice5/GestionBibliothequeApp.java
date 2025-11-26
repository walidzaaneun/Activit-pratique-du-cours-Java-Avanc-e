package com.walidzaaneun.Exercice5;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        DVD dvd = new DVD("Interstellar","Cristopher Nolan",false);
        Livre livre = new Livre("Le metamorphose","Franz Kafka",false);
        Utilisateur utilisateur = new Utilisateur("walidzaaneun");

        utilisateur.emprunterObjet(livre);
        utilisateur.emprunterObjet(dvd);

        livre.retourner();
        dvd.retourner();

    }
}
