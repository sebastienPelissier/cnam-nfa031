package Week5;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args){
        int entry1, entry2, entry3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first digit");
        entry1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter second digit");
        entry2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter third digit");
        entry3 = Integer.parseInt(scanner.nextLine());

        if ((entry1 <= entry2) && (entry2 <= entry3)) {
            System.out.println("The sort is ASC");
        } else {
            System.out.println("There is not sort");
        }
        scanner.close();
    }
}
