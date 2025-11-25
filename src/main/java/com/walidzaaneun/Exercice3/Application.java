package com.walidzaaneun.Exercice3;

public class Application {
    public static void main(String[] args) {
        Employe ingenieur = new Ingenieur("Zaanoun", "Walid", "walid@gmail.com", "0600000000", 10000, "Développement Java");
        Employe manager = new Manager("El Amrani", "Sara", "sara@gmail.com", "0611111111",15000, "Gestion des projets");

        System.out.println(manager);
        System.out.println(ingenieur);

        System.out.println(ingenieur.calculerSalaire());
        System.out.println(manager.calculerSalaire());

    }
}
