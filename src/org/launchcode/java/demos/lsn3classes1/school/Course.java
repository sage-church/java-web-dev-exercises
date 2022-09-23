package org.launchcode.java.demos.lsn3classes1.school;

import java.util.HashMap;

public class Course {

    public static void main(String[] args) {

        Course math = new Course("Math", 3);
        Course anotherMath = new Course("Science", 4);

        System.out.println(math.equals(anotherMath));

    }

    private String name;
    private int numberOfCredits;
    private HashMap<String, Integer> enrolledStudents = new HashMap<>();

    public Course(String name, int numberOfCredits) {
        this.name = name;
        this.numberOfCredits = numberOfCredits;
    }

    public Course(String name) {
        this(name, 3);
    }

    public String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    void enrollStudent(Student student) {
        enrolledStudents.put(student.getName(), student.getStudentId());
    }

    public boolean equals(Object objectToCompare) {

        if (objectToCompare == this) {
            return true;
        }

        if (objectToCompare == null) {
            return false;
        }

        if (objectToCompare.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) objectToCompare;
        return theCourse.getName() == getName();

    }

    public String toString() {

        return "Course: " + name + ", Number of credits: " + numberOfCredits;

    }

}
