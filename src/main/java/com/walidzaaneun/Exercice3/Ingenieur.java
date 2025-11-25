package com.walidzaaneun.Exercice3;

public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire*1.15;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", specialite='" + specialite;
    }
}
