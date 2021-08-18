package be.digitalcity.formation.calculatrice;

import java.util.Arrays;

public class Calculatrice {

    public static double multiplication(double ... doubles) {
        if(Arrays.stream(doubles).anyMatch(d -> d==0)) return 0;
        double result = 1;
        for (double d:doubles) {
            result = result*d;
        }
        return result;
    }

    public static double division(double ... doubles) {
        if(doubles.length==0) return Double.MIN_VALUE;
        if(doubles[0]==0) return 0;
        if(Arrays.stream(doubles).anyMatch(d-> d==0)) return Double.MIN_VALUE;
        double result = doubles[0];
        for (int i = 1 ; i < doubles.length ; i++) {
            result /= doubles[i];
        }
        return result;
    }


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

