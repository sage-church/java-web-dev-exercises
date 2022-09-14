package exercises.controlFlowAndCollections;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            integerList.add(i);
        }

        System.out.println(sumOfEvens(integerList));

    }

    public static int sumOfEvens(ArrayList<Integer> integerList) {

        int sum = 0;

        for (int integer : integerList) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

}
