package fr.jeudeloie;

import java.util.Random;

public class App {
    
    public static void main(String[] args) {

    Random generateur = new Random();
    int lancer;
    int caseBase = 0;
    int nbLancer = 5;
    int caseFinal = 20;
        
    for (int i = 1; i<= nbLancer;i++) {
       lancer = generateur.nextInt(6) + 1;
       caseBase = caseBase + lancer;
        System.out.println(" Lancer " + (i) + ": " + " vous avez fait " + lancer + "." + " Vous êtes sur la case " + caseBase);

    }
    System.out.println("Total des lancers : " + caseBase );

    if (caseBase == caseFinal) {
        System.out.println("gagné");
    } else {
        System.out.println("perdu");
    
    }
    }

}