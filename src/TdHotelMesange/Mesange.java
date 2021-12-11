package TdHotelMesange;

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
        System.out.println("[WELCOME]");

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

            int indexRoom;
            for (indexRoom = 0; indexRoom < rooms.length-1; indexRoom++){
                if ((indexRoom + 1)% 2 == 0
                        && group <= 2
                        && rooms[indexRoom] == 0
                ){
                    rooms[indexRoom] = group;
                    break;
                }

                if ((indexRoom + 1) % 2 != 0
                        && group > 2
                        && group <= maxGroup
                        && rooms[indexRoom] == 0
                ){
                    rooms[indexRoom] = group;
                    break;
                }
            }

            System.out.printf("room %d selected for the group with %d \n",indexRoom +1, group);

            indexRoom = 0 ;
            for (indexRoom = 0; indexRoom <= rooms.length-1; indexRoom++){
                System.out.printf("| Room %d: %d  person(s) \n", indexRoom+1, rooms[indexRoom]);
            }

            System.out.println("Do you want to add new group ? (Y or N)[Default = N]");
            answer = scanner.nextLine().charAt(0);

            if (answer == 'N'){
               exit = true;
            }
            iterationGlobalProgram ++;

        } while (!exit);
        System.out.println("[EXIT]");

        scanner.close();
    }
}
