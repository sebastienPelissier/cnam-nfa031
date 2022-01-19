package Examen;

public class naturalIndexing {

    public static void main(String[] args)
    {
        char [] inputArray = {'a', 'b', 'c', 'd'};
        char element = 'z';
        int index = 1;

        showArray(inputArray); // a | b | c | d |
        inputArray = addElementWithIndex(inputArray, index, element);
        showArray(inputArray); //  z | a | b | c | d |


        showArray(inputArray); // a | b | c | d |
        inputArray = addElementWithoutIndex(inputArray, element);
        showArray(inputArray); // a | b | c | d | z |

        showArray(inputArray); // a | b | c | d |
        inputArray = removeElement(inputArray, index);
        showArray(inputArray); //   b | c | d |

    }

    static void showArray(char[] inputArray)
    {
        int indexDataArray = 0;

        if (inputArray.length == 0 ){
            System.out.println("Your array is empty");
        }

        for (; indexDataArray <= inputArray.length-1; indexDataArray++){
            System.out.printf("%s | ", inputArray[indexDataArray]);
        }
    }

    static char[] addElementWithIndex(char[] inputArray, int index, char element)
    {
        char [] outputArray = new char [inputArray.length + 1];

        // appel de la methode pour tester si l'index demandé est dans le tableau, sinon au arret l'execution de la methode et on renvoie l'array d'origine
        if (!isIndex(inputArray, index)){
            System.out.println("index not found");
            return inputArray;
        }

        int i = 0;

        for (; i < index-1; i++){
            outputArray[i] = inputArray[i];
        }

        for (;i < index; i++){
            outputArray[i] = element;
        }

        for (;i < outputArray.length; i++){
            outputArray[i] = inputArray[i-1];
        }

        return outputArray;
    }

    static char[] addElementWithoutIndex(char[] inputArray, char element)
    {
        char [] outputArray = new char [inputArray.length + 1];

//        copie des elements de inputArray dans  l'outputArray
        for (int i = 0; i < inputArray.length; i++){
            outputArray[i] = inputArray[i];
        }

//      ajout de l'element au denier index de outputArray, soit outputArray.length-1 ou inputArray.length. Je garde le premier nommage
//      pour garder une cohérance et ne pas perdre le développeur'
        outputArray[outputArray.length-1] = element;

        return outputArray;
    }

    static char[] removeElement(char[] inputArray, int index)
    {
        char [] outputArray = new char [inputArray.length-1];

        if (!isIndex(inputArray, index)){
            System.out.println("index not found");
            return inputArray;
        }

        int i = 0;
        for (; i < index-1; i++){
            outputArray[i] = inputArray[i];
        }

        for (;i < outputArray.length; i++){
            outputArray[i] = inputArray[i+1];
        }

        return outputArray;
    }

    // test si l'index passer en parametre dans le methode  addElementWithIndex, addElementWithoutIndex et removeElement
    // sont bien presents dans le tableau avant toute action
    private static boolean isIndex(char[] dataArray, int indexRequest)
    {
//        premier test de la valeur de l'index'
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
