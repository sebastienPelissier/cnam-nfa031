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
                    dataArray = addElementWithIndex(dataArray);
                    break;
                case 3:
                    dataArray = removeElement(dataArray, scanner);
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

    static char[] removeElement(char[] dataArray, Scanner scanner)
    {
        boolean isIndex = false;
        char [] outputArray = new char [dataArray.length-1];

        int index = 0;
        do {
            System.out.println("What index do you want to remove ?");
            index = scanner.nextInt();

            isIndex = isIndex(dataArray, index);
            if (!isIndex){
                System.out.println("index not found");
            }

        }while (!isIndex);
        int i = 0;
        for (; i < index-1; i++){
            outputArray[i] = dataArray[i];
        }

        for (;i < outputArray.length; i++){
            outputArray[i] = dataArray[i+1];
        }


        System.out.printf("\nYou select index: %s", index);

        return outputArray;
    }

    static char[] addElementWithIndex(char[] dataArray)
    {
        boolean isIndex = false;
        char element = '\n';
        char [] outputArray = new char [dataArray.length + 1];

        Scanner scanner = new Scanner(System.in);

        System.out.println("What element do you want to add ?");
        element = scanner.nextLine().charAt(0);

        int index = 0;
        do {
            System.out.println("What index do you want to assign with element ?");
            index = scanner.nextInt();

            isIndex = isIndex(dataArray, index);
            if (!isIndex){
                System.out.println("index not found");
            }

        }while (!isIndex);
        int i = 0;

        for (; i < index-1; i++){
            outputArray[i] = dataArray[i];
        }

        for (;i < index; i++){
            outputArray[i] = element;
        }

        for (;i < outputArray.length; i++){
            outputArray[i] = dataArray[i-1];
        }

        System.out.printf("\nYou select index: %s", element);

        return outputArray;
    }

    static boolean isIndex(char[] dataArray, int indexRequest)
    {

        if (dataArray == null || indexRequest < 0) {
            return false;
        }
        for ( int indexDataArray = 0; indexDataArray <= dataArray.length; indexDataArray++){
            if (indexDataArray != indexRequest-1){
               continue;
            }
            return true;
        }

        return false;
    }

}
