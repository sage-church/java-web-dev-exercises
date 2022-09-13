package exercises;

import java.util.Scanner;

public class TextSearch2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice" +
                "'without pictures or conversation?'";

        String lowerCaseSentence = sentence.toLowerCase();

        System.out.println("Enter the word you would like to search for within our stored sentence:");

        String wordToSearch = input.nextLine().toLowerCase();

        if (lowerCaseSentence.contains(wordToSearch)) {

            int indexOfWord = lowerCaseSentence.indexOf(wordToSearch);
            int lengthOfWord = wordToSearch.length();
            String newSentence = lowerCaseSentence.replace(wordToSearch, "");

            System.out.println("This string of characters is at index " + indexOfWord + " within the stored" +
                    " sentence and has a length of " + lengthOfWord + " characters.");

            System.out.println(newSentence);

        } else {

            System.out.println("The stored sentence does not contain this string of characters.");

        }

    }

}
