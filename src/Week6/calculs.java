package Week6;

import java.util.Scanner;

public class calculs {
    public static void main(String[] args){
        int number = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value:");
        number = Integer.parseInt(scanner.nextLine());

        if ( number < 1 || number > 9) {
            do {
                System.out.println("Please enter value between 1 and 9");
                number = Integer.parseInt(scanner.nextLine());
            } while (number < 1 || number > 9);
        }

        for (int i=1; i < 10; i++ ){
            System.out.println(i + " * " +  number + " = " + number*i);
        }







    }
}
