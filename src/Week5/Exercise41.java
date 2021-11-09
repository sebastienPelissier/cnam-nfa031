package Week5;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args){
        int response;
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter a digit ?");
        response = Integer.parseInt(scanner.nextLine());
        if (response >= 0 ){
            System.out.println(response + " is a positive digit");
        }else {
            System.out.println(response + " is a negative digit");
        }
        scanner.close();
    }
}
