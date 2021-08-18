package be.digitalcity.formation.calculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatriceView {

    static boolean stillRunning;

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
            case 1:{

            }
            case 2:{

            }
            case 3:{

            }
            case 4:{

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
                if(choix >= 1 && choix <= nombreOptions){
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
}
