package Week5;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){
        double finalGrade = 0;
        double partialGrade = 0;
        double average = 0;
        String response;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your final grade");
        finalGrade = Double.parseDouble(scanner.nextLine());

        if (finalGrade < 7){
            System.out.println("Sorry you didn't have your exam");
        }else{
            System.out.println("Please enter your partial grade");
            partialGrade = Double.parseDouble(scanner.nextLine());
            average = (finalGrade + partialGrade) / 2;

            if (average >= 10 ){
                System.out.println("Good job");
            } else {
                System.out.println("Sorry you didn't have your exam");
            }
        }
        scanner.close();
    }
}
