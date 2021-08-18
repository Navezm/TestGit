package be.digitalcity.formation;

import java.util.Random;
import java.util.Scanner;

public class Pendu2 {

    public static void main(String[] args) {

    }
    static boolean motReponseComplet = true;
    // Liste de mots disponibles
    static String[] LISTE = {"Lapin", "Tortue", "Chaise", "Voiture", "Koala"};

    // Compteur d'erreurs, il commence à 0
    static int compteurErreurs =0;

    // Mot à deviner
    static String motChoisi = motAleatoire(LISTE);

    // Selectionne un mot dans liste
    static String motAleatoire (String[] liste){
        int index = new Random().nextInt(liste.length);
        return liste[index];
    }

    static char[] motReponse  = new char[motChoisi.length()];
    static void fillReponse (){
        for (int i = 0; i < motChoisi.length(); i++) {
            motReponse[i] = '_';
        }
    }

    public void jeu() {
        while (motReponseComplet || compteurErreurs < 6) {
            //...
            userInputValidation();
            //...
        }
        if (compteurErreurs == 6)
            System.out.println("Vous avez perdu ! Le mot était " + motChoisi);


    }

    // Vérifie si la lettre est présente
    boolean isCorrect (char x) {
        int[] index;
        boolean isInside = false;
        for (int i = 0; i < motChoisi.length(); i++) {
            if(x == motChoisi.charAt(i)) {
                motReponse[i] = x;
                isInside = true;
            }
        }
        return isInside;
    }

    // Le joueur rentre une lettre
    public void userInputValidation () {
        Scanner scanner = new Scanner(System.in);
        char e = scanner.nextLine().charAt(0);

        if (isCorrect(e)){
            //...

        }
        else {
            System.out.println("Pas de bol");

            compteurErreurs++;
        }
        System.out.println(motReponse);
    }

}
