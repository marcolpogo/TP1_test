package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONSerializer;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;


public class JSONAnalyser {

    String filePath;
    String jsonString ="";
    JSONObject jsonObject;

    public JSONAnalyser(String filePath) {
        this.filePath = filePath;
    }

    public boolean loadJson() {
        try {
            jsonString = FileHash.readFileToString(filePath);
            jsonObject = (JSONObject) JSONSerializer.toJSON(jsonString);

        } catch (Exception e) {
            System.out.println("Enter valid filename");
            return false;
        }
        return true;
    }
    // a changer
    public DemandeReclamation createClient() {
        JSONObject C = this.jsonObject;
        JSONArray reclamations = C.getJSONArray("reclamations");
        return new DemandeReclamation(C.getString("client"), C.getString("contrat"), C.getString("mois"), reclamations );
    }
}