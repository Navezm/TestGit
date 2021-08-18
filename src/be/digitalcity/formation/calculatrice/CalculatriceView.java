package be.digitalcity.formation.calculatrice;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalculatriceView {

    static boolean stillRunning;
    static List<Double> numbers;

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
                "4) Division\n" +
                "5) Quitter\n"
        );
        int choix = choisirChiffre(4);

        switch (choix) {
            case 1:{

                Calculatrice.addition(castNumbers());
            }
            case 2:{

                Calculatrice.substraction(castNumbers());
            }
            case 3:{

                Calculatrice.multiplication(castNumbers());
            }
            case 4:{

                Calculatrice.division(castNumbers());
            }
            case 5: {
                System.out.println("Aurevoir!");
                stillRunning = false;
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

    public static double[] castNumbers() {
        double [] args = new double[numbers.size()];
        for (int i = 0 ; i < args.length ; i++) {
            args[i]= numbers.get(i);
        }
        return args;
    }
}
