package week10;

import java.util.Arrays;
import java.util.Scanner;

public class td431 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String [] sellerLabel = {"andré", "ingemar", "jean-jérôme", "Cindy", "Joey"};
        String [] carLabel = {"twingo", "clio", "mégane", "vel satis"};
        String sellerSummary = "";
        String summarySales = "";

        int [][] sales = new int[sellerLabel.length][carLabel.length];

        int biggerLengthSeller = 0;
        for (String seller: sellerLabel) {
            if (biggerLengthSeller < seller.length()){
                biggerLengthSeller = seller.length();
            }
        }
        String spaces = "";
        for (int i=0; i < biggerLengthSeller; i++){
            spaces += " ";
        }
        String carLabelRow = "|" +  spaces + "|";

        int biggerLengthCar = 0;
        for (String car: carLabel) {
            if (biggerLengthSeller < car.length()){
                biggerLengthSeller = car.length();
            }
        }
        String spacesCar = "";
        for (int i=0; i < biggerLengthSeller; i++){
            spacesCar += " ";
        }

        for(int i=0; i< sales.length; i++){
            int totalSale = 0;
            String carSummary = "";
            for(int j=0; j< sales[i].length; j++){
                System.out.printf("Please enter value for seller %s and car model %s : ", sellerLabel[i], carLabel[j]);
                sales[i][j] = Integer.parseInt((scanner.nextLine()));
                carSummary += "|" + spacesCar + sales[i][j];
                totalSale += sales[i][j];

                if (i==0) {
                    carLabelRow += carLabel[j] + "|";
                }
            }

            summarySales +=  "| " + totalSale;
            sellerSummary += "|" + sellerLabel[i] + carSummary +"\n";

        }
        System.out.printf(carLabelRow + "\n" + sellerSummary + "|"+ spaces + summarySales);

        scanner.close();
    }
}
