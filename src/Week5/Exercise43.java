package Week5;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args){
        int length = 10;
        double result = 0;
        result = getResult(length);
        System.out.println(result);

        length = 0;
        result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a digit for length");
        length = Integer.parseInt(scanner.nextLine());
        result = getResult(length);
        System.out.println(result);

        length = 0;
        result = 0.0;
        System.out.println("Please enter a digit for length");
        length = Integer.parseInt(scanner.nextLine());
        result = getResult(length);

        double response = result / length;
        System.out.println(response);
        scanner.close();
    }

    private static double getResult (Integer length){
        double result = 0.0;
        for(int i=0; i<length; i++ ){
            result = result+i;
        }

        return result;
    }

}
