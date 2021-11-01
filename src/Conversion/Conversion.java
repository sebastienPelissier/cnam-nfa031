package Conversion;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#.##");
        dFormat.setRoundingMode(RoundingMode.HALF_UP);

        double euros = 0.0;
        double dollars = 0.0;

        System.out.println("Indiquez une somme en euros ?");
        euros = Double.parseDouble(scanner.nextLine());
        dollars = euros * 1.1558;

        System.out.println("La somme en Dollars est de " + dFormat.format(dollars) + " $");
        scanner.close();
    }
}
