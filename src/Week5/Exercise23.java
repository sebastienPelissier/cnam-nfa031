package Week5;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        int entry1, entry2, entry3, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first digit");
        entry1 = Integer.parseInt(scanner.nextLine());
        result = entry1;
        System.out.println("Please enter second digit");
        entry2 = Integer.parseInt(scanner.nextLine());

        if (entry2 > entry1){
            result = entry2;
        }
        System.out.println("Please enter third digit");
        entry3 = Integer.parseInt(scanner.nextLine());

        if (entry3 > result){
            result = entry3;
        }
        System.out.println("The biggest digit is " + result);
        scanner.close();
    }

}
