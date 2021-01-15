package objectExamplesOne;

import java.util.ArrayList;

public class Student {

    private static String university;

    private String name;

    private String surname;

    private int birthDate;

    private String id;

    private ArrayList<String> lessons;

    public Student(){

    }

    public Student(String name, String surname, int birthDate, String id, ArrayList<String> lessons) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.id = id;
        this.lessons = lessons;
    }

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<String> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", education='" + university + '\'' +
                ", id='" + id + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}

 
