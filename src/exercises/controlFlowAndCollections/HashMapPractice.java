package exercises.controlFlowAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {

            System.out.println("Student name:");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Student ID:");
                int studentID = input.nextInt();
                students.put(studentID, newStudent);

                input.nextLine();
            }

        } while (!newStudent.equals(""));

        System.out.println("Class roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {

            System.out.println("Student: " + student.getValue() + " | " + "ID: " + student.getKey());

        }


    }

}
