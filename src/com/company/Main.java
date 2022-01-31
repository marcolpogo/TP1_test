package com.company;

public class Main {

    public static void main(String[] args) {
	String filePath = args[0];
    JSONAnalyser analyser = new JSONAnalyser(filePath);
    if (!analyser.loadJson()) return;
    DemandeReclamation c1 = analyser.createClient();
    System.out.println(c1.toString());



    }
}
