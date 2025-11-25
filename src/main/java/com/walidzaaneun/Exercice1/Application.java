package com.walidzaaneun.Exercice1;

public class Application {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Walid","Zaanoun","zaanoun@gmail.com","0612345678",24,1);

        Auteur auteur = new Auteur("Franz","Kafka","kafka@gmail.com","0612345678",30, 1);

        Livre livre = new Livre("23456765", "La métamorphose", auteur);

        System.out.println(adherent);
        System.out.println(livre);
    }
}
