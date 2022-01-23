package Mastermind;

import java.util.Locale;
import java.util.Scanner;

public class Mastermind {

    public static void main(String [] arg)
    {
        Scanner scanner = new Scanner(System.in);
        String [] secretCombination = new String[0];
        int answer = 0;
        System.out.println("### WELCOME ###");

        do {
            System.out.println(
                    "PLAY: 1\n"+
                    "SOLUTION: 2\n" +
                    "SHOW COLOR AUTHORIZED: 3\n"+
                    "EXIT: 4"
            );

            answer = scanner.nextInt();
            switch (answer){
                case 1:
                    secretCombination = generateRandomCombination();
                    playGame(secretCombination, scanner);
                    break;
                case 2:
                    showSolution(secretCombination);
                    break;
                case 3:
                    showColorAuthorized();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error : action not found");
                    break;
            }

        } while(answer != 4);
        System.out.println("### GOOD BYE ###");
        scanner.close();
    }

    static String [] TAB_REF_COLORS = {
            "rouge",
            "jaune",
            "vert",
            "bleu",
            "orange",
            "blanc",
            "violet",
            "fuchsia"
    };

    static int NB_COLORS = 4;

    // Generate random combination of 4 colors
    static String [] generateRandomCombination() {
        String [] combination = new String[NB_COLORS];
        int currentPosition = 0;
        while(currentPosition!=NB_COLORS) {
            int indexRandom = (int)(Math.random()*TAB_REF_COLORS.length);
            String color = TAB_REF_COLORS[indexRandom];
            if(!isIn(color, combination)) {
                combination[currentPosition] = color;
                currentPosition++;
            }
        }
        return combination;
    }

    static boolean playGame(String [] secretCombination, Scanner scanner)
    {
        showSolution(secretCombination);

        String [] userCombination = new String[secretCombination.length];
        if (!(secretCombination.length > 0)){
           System.out.println("Error, secret combination is empty");

           return false;
        }

        System.out.println(
                "Combination is generated\n" +
                "Good Luck ! :)\n"
        );

        for(int i=0; i < userCombination.length; i++){
            String answer = "";
            Boolean isColorValid = false;

            // Controle, si la valeur entrée par le user est bien une couleur disponible
            // Tant que celui ci ne donne pas une couleur autorisée, on lui indique de la resaisir
            do{

                System.out.printf("Please, enter your combination color %s :", i+1);
                answer = scanner.nextLine().toLowerCase();

                if(isIn(answer, TAB_REF_COLORS)){
                    isColorValid = true;
                } else {
                    System.out.println("\nColor not valid");
                }

            }while(!isColorValid);

            userCombination[i] = answer;
        }

        checkUserResponse(userCombination, secretCombination);

        return true;
    }

    static void showSolution(String [] secretCombination)
    {
        for(int i=0;i<4;i++) {
            System.out.println(secretCombination[i]);
        }
        // jump to line
        System.out.println("");
    }

    static void showColorAuthorized()
    {
        for(int i=0;i<TAB_REF_COLORS.length;i++) {
            System.out.println(TAB_REF_COLORS[i]);
        }
        // jump to line
        System.out.println("");
    }

    static boolean isIn(String iStringToFind, String [] iTab) {
        int size = iTab.length;
        for(int i=0;i<size;i++) {
            if(iStringToFind.equalsIgnoreCase(iTab[i])) return true;
        }
        return false;
    }

    private static void checkUserResponse(String [] userCombination, String [] secretCombination)
    {
        int goodColorAndPosition = 0;
        int goodColorWrongPosition = 0;

        for(int i=0; i< userCombination.length; i++){

            System.out.printf("user %s, cpu %s\n", userCombination[i], secretCombination[i]);

            if (userCombination[i].equals(secretCombination[i])){
                goodColorAndPosition ++;
                continue;
            }

            for(int j=0; j< secretCombination.length; j++){
                if (userCombination[i].equals(secretCombination[j])){
                    goodColorWrongPosition++;
                }
            }
        }

        System.out.printf("goodColorAndPosition = %s\ngoodColorWrongPosition = %s\n", goodColorAndPosition, goodColorWrongPosition );
    }

}
