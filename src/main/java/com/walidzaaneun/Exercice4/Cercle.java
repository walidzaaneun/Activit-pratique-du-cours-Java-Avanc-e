package com.walidzaaneun.Exercice4;

public class Cercle extends Figure {

    private double rayon;

    Cercle(String nom, double rayon){
        this.nom = nom;
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}
