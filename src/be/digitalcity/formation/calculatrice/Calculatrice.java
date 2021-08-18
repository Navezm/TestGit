package be.digitalcity.formation.calculatrice;

import java.util.Arrays;

public class Calculatrice {

    public static double addition(double... numbers){
        if (numbers.length > 0) {
            return Arrays.stream(numbers).sum();
        }
        else System.err.println("No numbers entered");
        return 0;
    }

    public static double substraction(double... numbers) {
        double total = 0;
        if (numbers.length > 1) {
            total = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    continue;
                } else{
                    total = total - numbers[i];
                }
            }
        } else System.out.println("At least two numbers required");
        return total;
    }
}

