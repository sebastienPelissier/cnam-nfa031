package Week5;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args){
        int length, i;
        String stars = "****";
        String middleStars = "*  *";
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many star row would you like ?");
        length = Integer.parseInt(scanner.nextLine());

        for (i=1; i <=length; i++) {
          if (i == 1 || i==length){
            System.out.println(stars);
          } else {
              System.out.println(middleStars);
          }
        }
        scanner.close();
    }
}
