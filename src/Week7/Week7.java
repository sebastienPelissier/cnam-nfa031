package Week7;

import java.util.Scanner;

public class Week7 {
    public static void main(String[] args)
    {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size:");
        number = Integer.parseInt(scanner.nextLine());


        if ( number < 0 ){
            do {
                System.out.println("Please enter value > 0");
                number = Integer.parseInt(scanner.nextLine());
            } while (number < 1);
        }

        String line = "";
        for (int i=0; i < number ; i++ ){
            line += "*";
        }

        for (int j=0; j<number ; j++){
            System.out.println(line);
        }
    }

}
