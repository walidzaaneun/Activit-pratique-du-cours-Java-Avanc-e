package com.walidzaaneun.Exercice4;

public abstract class Figure {
    protected String nom;

    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public void afficherDetails(){
        System.out.println("Nom de figure: " + nom);
        System.out.println("Aire de figure: " + calculerAire());
        System.out.println("Perimetre de figure: " + calculerPerimetre());
    }
}
