package com.walidzaaneun.Exercice5;

public class Utilisateur {
    private String nomUtilisateur;

    public Utilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void emprunterObjet(Empruntable objet){
        objet.emprunter();
    }
}
