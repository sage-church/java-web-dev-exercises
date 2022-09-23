package org.launchcode.java.demos.lsn3classes1.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;

    private int totalQualityScore;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    void setName(String name) {
        this.name = name;
    }

    void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }


    public String getGradeLevel() {

        if (numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits <= 59) {
            return "Sophomore";
        } else if (numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }

    }

    public void addGrade(int courseCredits, double grade) {

        totalQualityScore += gpa * numberOfCredits;

        totalQualityScore += grade * courseCredits;

        numberOfCredits += courseCredits;

        gpa = (totalQualityScore) / numberOfCredits;

    }

}