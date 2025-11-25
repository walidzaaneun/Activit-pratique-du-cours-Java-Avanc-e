package com.walidzaaneun.Exercice4;

public class Application {
    public static void main(String[] args) {
        Figure cercle = new Cercle("cercle",4);
        Figure rectangle = new Rectangle("rectangle",12,7);
        Figure carre = new Rectangle("carre",3,3);

        cercle.afficherDetails();
        System.out.println("=====================");
        rectangle.afficherDetails();
        System.out.println("=====================");
        carre.afficherDetails();
    }
}
