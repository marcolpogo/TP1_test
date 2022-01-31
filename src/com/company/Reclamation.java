package com.company;

import java.util.Date;

public class Reclamation {
    int soin;
    String date;
    double montant;

    Reclamation(int soin, String date, String montant) {
        this.soin = soin;
        this.date = date;
        this.montant = Double.parseDouble(montant.replace("$", ""));
    }

    public String toString() {
        return "Soin = " + soin + ", date = " + date + ", montant = " + montant;
    }
}
