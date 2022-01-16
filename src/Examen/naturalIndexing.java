package Examen;

import java.util.Scanner;

public class naturalIndexing {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        char [] dataArray = {'a', 'b', 'c', 'd'};
        System.out.println("### WELCOME ###");
        do {
            System.out.println(
                    "\nSELECT ACTION\n" +
                    "SHOW: 1\n"+
                    "ADD ELEMENT: 2\n" +
                    "REMOVE ELEMENT: 3\n" +
                    "EXIT: 4"
            );

            answer = scanner.nextInt();
            switch (answer){
                case 1:
                    showArray(dataArray);
                    break;
                case 2:
                    addElementWithIndex(dataArray);
                    break;
                case 3:
                    removeElement(dataArray, scanner);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error : action not found");
                    break;
            }

        }while(answer != 4);

        scanner.close();

    }

    static void showArray(char[] dataArray)
    {
        int indexDataArray = 0;
        System.out.println("### ARRAY ###");

        if (dataArray.length == 0 ){
            System.out.println("Your array is empty");
        }

        for (; indexDataArray <= dataArray.length-1; indexDataArray++){
            System.out.printf("index: %s | value: %s\n", indexDataArray+1, dataArray[indexDataArray]);
        }

    }

    static boolean removeElement(char[] dataArray, Scanner scanner)
    {
        int answer;
        boolean isIndex = false;
        System.out.println("What index do you want to remove ?");
        answer = scanner.nextInt();

        isIndex = isIndex(dataArray, answer);
        if (!isIndex){
            System.out.println("index not found");
            return false;
        }

        System.out.printf("\nYou select index: %s", answer);

        return true;
    }

    static boolean addElementWithIndex(char[] dataArray)
    {
        boolean isIndex = false;
        char element = '\n';

        Scanner scanner = new Scanner(System.in);

        System.out.println("What element do you want to add ?");
        element = scanner.nextLine().charAt(0);
        System.out.println("What index do you want to assign with element ?");
        int index = scanner.nextInt();

        isIndex = isIndex(dataArray, index);
        if (!isIndex){
            System.out.println("index not found");
            return false;
        }

        // todo push element to array
//        dataArray[index] = element;

        System.out.printf("\nYou select index: %s", element);

        return true;
    }

    static boolean isIndex(char[] dataArray, int indexRequest)
    {

        if (dataArray == null) {
            return false;
        }
        for ( int indexDataArray = 0; indexDataArray <= dataArray.length-1; indexDataArray++){
            if (indexDataArray != indexRequest){
               continue;
            }
            return true;
        }

        return false;
    }

}
