package com.walidzaaneun.Exercice6;

public class CreditCard extends Paiement {
    private long numeroCard;

    public CreditCard(int numeroTransaction, double solde, long numeroCard) {
        super(numeroTransaction, solde);
        this.numeroCard = numeroCard;
    }

    @Override
    public void effectuerPaiement(double montant) {
        if (solde >= montant) {
            this.solde -= montant;
            System.out.println("votre paiement Credit Card a été effectué");
        }else  {
            System.out.println("Erreur solde Credit Card insuffisant, Votre montant commande : " + montant +", Votre solde : "+ solde);
        }
    }
}
