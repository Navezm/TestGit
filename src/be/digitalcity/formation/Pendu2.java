package be.digitalcity.formation;

import java.util.Random;
import java.util.Scanner;

public class Pendu2 {

    // Liste de mots disponibles
    static String[] LISTE = {"Lapin", "Tortue", "Chaise", "Voiture", ""};

    // Compteur d'erreurs, il commence à 0
    static int compteurErreurs =0;

    // Mot à deviner
    static String motChoisi = motAleatoire(LISTE);

    // Selectionne un mot dans liste
    static String motAleatoire (String[] liste){
        String motChoisi = "";
        int index = new Random().nextInt(liste.length);
        return liste[index];
    }



    public void jeu() {
        while (compteurErreurs < 6) {
            //...
            userInputValidation();
            //...
        }
        System.out.println("Vous avez perdu ! Le mot était " + motChoisi);
    }

    // Vérifie si la lettre est présente
    boolean isCorrect (char x) {
        //...
        return true;
    }

    // Le joueur rentre une lettre
    public void userInputValidation () {
        Scanner scanner = new Scanner(System.in);
        char e = scanner.nextLine().charAt(0);

        if (isCorrect(e)){
            //...

        }
        else {
            compteurErreurs++;
        }
    }

}
