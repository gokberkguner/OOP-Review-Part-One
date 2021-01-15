package objectExamplesTwo;

import java.util.ArrayList;

public class StudentTestProgram {
    public static void main(String[] args) {

        Student.setUniversity("Uskudar University");

        ArrayList<String> lessons = new ArrayList<>();

        lessons.add("Data Structures");
        lessons.add("Differential Equations");
        lessons.add("Object Oriented Programming I");
        lessons.add("Operating Systems");
        lessons.add("Software Requirements Analysis");
        lessons.add("Computer Architecture");

        Student student1 = new Student("Gökberk","Güner",2000,"180209017",lessons);

        //showLessons(student1);
        showLessons1(student1);

    }

    public static void showAllInfos(Student student){
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Birth Date: " + student.getBirthDate());
        System.out.println("Education: " + Student.getUniversity());
        System.out.println("Lessons: " + student.getLessons());
    }

    public static void showLessons(Student student){
        System.out.println(student.getName() + "'s Lessons: " + student.getLessons());
    }

    // Second Option for showing lessons that students take.
    public static void showLessons1(Student student){
        ArrayList<String> lessons = student.getLessons();

        System.out.println("- " + student.getName()+ "'s Lessons -");

        for (String lesson : lessons){
            System.out.println(lesson);
        }
    }

}

 
