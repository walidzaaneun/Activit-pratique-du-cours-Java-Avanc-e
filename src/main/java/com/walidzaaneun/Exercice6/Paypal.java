package com.walidzaaneun.Exercice6;

public class Paypal extends Paiement {
    private String email;

    public Paypal(int numeroTransaction, double solde, String email) {
        super(numeroTransaction, solde);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        if (solde >= montant) {
            this.solde -= montant;
            System.out.println("votre paiement Paypal a été effectué");
        }else  {
            System.out.println("Erreur solde Paypal insuffisant, Votre montant commande : " + montant +", Votre solde : "+ solde);
        }
    }
}
