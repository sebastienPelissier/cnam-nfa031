package week10;

import java.util.Scanner;

public class td432 {
    public static void main (String[]arg) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int indexDay;

        String[] hours = {
                "9 a.m to 10h00",
                "10 a.m to 11 a.m",
                "11 a.m to 12 a.m",
                "12 p.m to 13 p.m",
                "13 p.m to 14 p.m",
                "14 p.m to 15 p.m",
                "15 p.m to 16 p.m",
                "16 p.m to 17 p.m",
                "17 p.m to 18 p.m",
                "18 p.m to 19 p.m",
        };
        boolean[][] booked =
                {
                        {false, true, true, true, false, true, true, false, true, false},
                        {false, true, true, true, false, true, true, false, true, false},
                        {false, false, true, true, false, false, true, false, true, false},
                        {true, true, false, true, false, true, true, false, true, true},
                        {false, true, false, true, false, true, true, false, false, false}
                };
        String isBooked = "";
        boolean dayFound = false;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, what day would like ?");
            String dayChosen = scanner.nextLine();

            indexDay = 0;
            for (String day : days) {
                if (day.equalsIgnoreCase(dayChosen)) {
                    dayFound = true;
                    break;
                }
                indexDay++;
            }
        } while (!dayFound);

        int hourChosen;
        do {
            System.out.println("Please, what hours would like ?");
            hourChosen = Integer.parseInt((scanner.nextLine()));
        } while (hourChosen > hours.length - 1 || hourChosen < 0);

        isBooked = booked[indexDay][hourChosen] ? "booked" : "free";

        System.out.printf("The room is %s for %s at %s\n", isBooked, days[indexDay], hours[hourChosen]);

        for (int i = 0; i <= booked.length - 1; i++) {
            int hoursFree = 0;
            for (int j = 0; j <= booked[i].length - 1; j++) {
                if (!booked[i][j]) {
                    hoursFree++;
                }
            }
            Float rate = (float) ((hoursFree / booked[i].length) * 100);
            System.out.printf("%s : %s \n", days[i], rate);
        }
        // ---------------------------------------------------------------------
        // Question 4.3
        dayFound = false;
        do {
            System.out.println("Please, what day would like to book ?");
            String dayChosen = scanner.nextLine();

            indexDay = 0;
            for (String day : days) {
                if (day.equalsIgnoreCase(dayChosen)) {
                    dayFound = true;
                    break;
                }
                indexDay++;
            }
        } while (!dayFound);

        boolean bookable = false;
        do {
            System.out.println("Please, what hours would like ?");
            hourChosen = Integer.parseInt((scanner.nextLine()));

            if (booked[indexDay][hourChosen]){
                System.out.println("Already booked\n");
            } else {
                bookable = true;
            }


        } while (!bookable);
        System.out.printf("Success, the slot %s for %s is booked", hours[hourChosen], days[indexDay] );

        scanner.close();
    }
}
