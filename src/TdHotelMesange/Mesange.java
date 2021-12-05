package TdHotelMesange;

import java.util.Arrays;
import java.util.Scanner;

public class Mesange {

    public static void main(String[] args) {

        int maxRooms = 5;
        int maxGroup = 4;
        int group = 0;
        int iterationInitGroupQuestion=0;
        int iterationGlobalProgram=1;
        int [] rooms = new int[maxRooms];
        boolean exit = false;
        char answer = 'N';
        Scanner scanner = new Scanner(System.in);

        do {

            do {
                iterationInitGroupQuestion ++;

                if (iterationInitGroupQuestion > 1 && iterationGlobalProgram == 0 ){
                        System.out.printf("The limit by room is %d, please try again : ", maxGroup);
                } else {
                    System.out.println("Please enter :");
                    iterationGlobalProgram = 0;
                }

                group= Integer.parseInt(scanner.nextLine());
            } while (group > maxGroup);

            System.out.printf("Group: %d \n", group);

            int indexRoom = 1;
            for ( int room : rooms ) {

                if (Arrays.stream(rooms).anyMatch(i -> i != 0)){
                    System.out.printf("No vacancy");
                    exit = true;
                    break;
                }

                if (indexRoom % 2 == 0 && group <= 2 ){
                    room = group;
                    break;
                }

                if (indexRoom % 2 != 0 && group > 2 && group <= maxGroup && room == 0 ){
                    room = group;
                    break;
                }
                indexRoom++;
            }
            System.out.printf("room %d selected for the group with %d \n",indexRoom, group);
            System.out.println("Do you want to add new group ? (Y or N)[Default = N]");
            answer = scanner.nextLine().charAt(0);

            if (answer == 'N'){
               exit = true;
            }
            iterationGlobalProgram ++;


//            System.out.println(Arrays.stream(rooms).anyMatch(i -> i != 0));

        } while (!exit);

        scanner.close();
    }
}
