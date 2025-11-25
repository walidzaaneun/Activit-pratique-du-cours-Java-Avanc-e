package com.walidzaaneun.Exercice3;

public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected String telephone;
    protected String email;
    protected double salaire;

    public Employe(){}

    public Employe(String nom, String prenom, String telephone, String email, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return
                "nom='" + nom +
                ", prenom='" + prenom +
                ", telephone='" + telephone +
                ", email='" + email +
                ", salaire=" + salaire;
    }

    public abstract double calculerSalaire();
}
