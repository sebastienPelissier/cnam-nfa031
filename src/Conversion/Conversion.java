package Conversion;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double euros = 0.0;
        double dollars = 0.0;

        System.out.println("Indiquez une somme en euros ?");
        euros = Double.parseDouble(scanner.nextLine());
        dollars = euros * 1.17;
        System.out.println("La somme en Dollars est de " + dollars + " $");
        scanner.close();
    }
}
