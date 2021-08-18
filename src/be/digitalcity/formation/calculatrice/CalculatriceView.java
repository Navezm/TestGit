package be.digitalcity.formation.calculatrice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalculatriceView {

    static boolean stillRunning;
    static List<Double> numbers = new ArrayList();

    public static void open() {
        System.out.println("-------CALCULATRICE-------");
        stillRunning = true;
        while (stillRunning) {
            openMenu();
        }
    }

    private static void openMenu() {
        System.out.println("Sélectionnez une opération");
        System.out.println("1) Addition\n" +
                "2) Soustraction\n" +
                "3) Multiplication\n" +
                "4) Division");
        int choix = choisirChiffre(4);

        switch (choix) {
            case 1: {

            }
            case 2: {

            }
            case 3: {

            }
            case 4: {

            }
        }
    }

    private static int choisirChiffre(int nombreOptions) {
        int choix = 0;
        boolean caractereValide = false;
        while (!caractereValide) {
            try {
                Scanner scan = new Scanner(System.in);
                choix = scan.nextInt();
                if (choix >= 1 && choix <= nombreOptions) {
                    caractereValide = true;
                } else {
                    System.out.println("Veuillez entrer un chiffre entre 1 et " + nombreOptions);
                    openMenu();
                }
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un chiffre entre 1 et " + nombreOptions);
                openMenu();
            }
        }
        return choix;
    }

    private static void enterNumbers() {
        System.out.println("Entrez le premier nombre");
        while(tryNewAnswer()){
            System.out.println("Entrez le premier nombre");
            tryNewAnswer();
        }

        System.out.println("Entrez le nombre suivant");
        while(tryNewAnswer()){
            System.out.println("Entrez le nombre suivant");
            tryNewAnswer();
        }

        System.out.println("Souhaitez-vous entrer un autre nombre?\n" +
                "1) Oui\n" +
                "2) Non");
        int answer = choisirChiffre(2);

        while (answer == 1) {
            System.out.println("Entrez le nombre suivant");
            while(tryNewAnswer()){
                System.out.println("Entrez le nombre suivant");
                tryNewAnswer();
            }

            System.out.println("Souhaitez-vous entrer un autre nombre?\n" +
                    "1) Oui\n" +
                    "2) Non");
            answer = choisirChiffre(2);
        }
    }

    private static boolean tryNewAnswer(){
        Scanner scan = new Scanner(System.in);
        try{
            double answer = scan.nextInt();
            numbers.add(answer);
            return false;

        } catch (InputMismatchException e){
            System.err.println("Caractère invalide");
            return true;
        }
    }
}
