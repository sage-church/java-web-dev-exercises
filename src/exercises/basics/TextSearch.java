package exercises.basics;

import java.util.Scanner;

public class TextSearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice" +
                "'without pictures or conversation?'";

        String lowerCaseSentence = sentence.toLowerCase();

        System.out.println("Enter the word you would like to search for within our stored sentence:");

        String wordToSearch = input.nextLine().toLowerCase();

        String result = lowerCaseSentence.contains(wordToSearch) ? "true" : "false";

        System.out.println(result);

    }

}
