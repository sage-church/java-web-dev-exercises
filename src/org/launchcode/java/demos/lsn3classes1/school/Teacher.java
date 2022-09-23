package org.launchcode.java.demos.lsn3classes1.school;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public Teacher(String firstName, String lastName, String subject) {
        this(firstName, lastName, subject, 0);
    }

    public String getFirstName() {
        return this.firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return this.subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }

}
