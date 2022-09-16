package org.launchcode.java.studios.controlFlowAndCollections;

import java.util.*;

public class CountingCharacters {

    public static void main(String[] args) {

        System.out.println("Enter a word, sentence, paragraph, or some gibberish:");

        Scanner input = new Scanner(System.in);

        String stringToBeAnalyzed = input.nextLine();

        String lowerCaseStringToBeAnalyzed = stringToBeAnalyzed.toLowerCase();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for (int i = 0; i < lowerCaseStringToBeAnalyzed.length(); i++) {

            char characterAtIndex = lowerCaseStringToBeAnalyzed.charAt(i);

            if (characterCounts.containsKey(characterAtIndex)) {

                characterCounts.put(characterAtIndex, characterCounts.get(characterAtIndex) + 1);

            } else {

                characterCounts.put(characterAtIndex, 1);

            }

        }

        for (Map.Entry<Character, Integer> set : characterCounts.entrySet()) {

            System.out.println(set.getKey() + " : " + set.getValue());

        }

    }

}
