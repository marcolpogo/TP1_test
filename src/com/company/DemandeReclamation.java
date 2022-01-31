package com.company;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;

public class DemandeReclamation {
    int id;
    String contrat;
    String mois;
    ArrayList<Reclamation> reclamations = new ArrayList<Reclamation>();
    //Remboursements à faire;

    DemandeReclamation(String id, String contrat, String mois, JSONArray reclamations) {
        this.id = Integer.parseInt(id);
        this.contrat = contrat;
        this.mois = mois;
        for (int i = 0; i < reclamations.size(); i++) {
            JSONObject rec = (JSONObject) reclamations.get(i);

            int soin = rec.getInt("soin");
            String date =rec.getString("date");
            String montant = rec.getString("montant");
            if (reclamations.get(i)!= null) this.reclamations.add(new Reclamation(soin, date, montant));
        }
    }

    public String toString() {
        String toReturn = "id = " + id + ", type = " + contrat + ", mois = " + mois;
        for (int i = 0; i < reclamations.size(); i++) {
            toReturn += "\n";
            toReturn += reclamations.get(i).toString();
        }
        return toReturn;
    }
}
