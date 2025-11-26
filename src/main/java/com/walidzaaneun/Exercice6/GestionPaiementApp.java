package com.walidzaaneun.Exercice6;

public class GestionPaiementApp {
    public static void main(String[] args) {
        Paiement paypal = new Paypal(1,3000,"walid@paypal.com");
        Paiement creditCard = new CreditCard(2,1500, 123_456_797_897_089L);

        Commande commande = new Commande(1000,paypal);
        Commande commande2 = new Commande(2000,creditCard);

        commande.processPayment();
        System.out.println("============================");
        commande2.processPayment();
    }
}
