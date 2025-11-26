package com.walidzaaneun.Exercice6;

public abstract class Paiement {
    protected int numeroTransaction;
    protected double solde;

    public Paiement(int numeroTransaction, double solde) {
        this.numeroTransaction = numeroTransaction;
        this.solde = solde;
    }


    public abstract void effectuerPaiement(double montant);
}
