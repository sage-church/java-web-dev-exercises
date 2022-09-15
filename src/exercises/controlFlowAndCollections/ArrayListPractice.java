package exercises.controlFlowAndCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            integerList.add(i);
        }

        System.out.println(sumOfEvens(integerList));

//        --------------------------------------

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("sometimes");
        stringList.add("five");
        stringList.add("stack");
        stringList.add("house");
        stringList.add("little");
        stringList.add("ghost");

        printFiveLetterWords(stringList);

    }

//    --------------------------------------------

    public static int sumOfEvens(ArrayList<Integer> integerList) {

        int sum = 0;

        for (int integer : integerList) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

//    ------------------------------------------

    public static void printFiveLetterWords(ArrayList<String> wordList) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of characters the printed words should have:");

        int wordLengthRequested = input.nextInt();

        for (String word : wordList) {

            if (word.length() == wordLengthRequested) {
                System.out.println(word);
            }

        }

    }

}
