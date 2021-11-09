package Week5;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args){
        int i,length = 10, result = 0;
        for(i=1; i<=length; i++ ){
            result = result+i;
        }
        System.out.println(result);

        int i2,length2 = 0, result2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a digit for length");
        length2 = Integer.parseInt(scanner.nextLine());

        for(i2=1; i2<=length2; i2++ ){
            result2 = result2+i2;
        }
        System.out.println(result2);

        int i3;
        double result3 = 0.0, length3 = 0.0;
        System.out.println("Please enter a digit for length");
        length3 = Integer.parseInt(scanner.nextLine());

        for(i3=1; i3<=length3; i3++ ){
            result3 = result3+i3;
        }
        double response = result3 / length3;
        System.out.println(response);
        scanner.close();

    }
}
