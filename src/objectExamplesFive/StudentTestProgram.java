package objectExamplesFive;

import java.util.ArrayList;

public class StudentTestProgram {
    public static void main(String[] args) {

        Student student1 = new Student("Gökberk","Güner",2000,"180209017",null);

        ArrayList<String> lessons = new ArrayList<>();

        lessons.add("Data Structures");
        lessons.add("Differential Equations");
        lessons.add("Object Oriented Programming I");
        lessons.add("Operating Systems");
        lessons.add("Software Requirements Analysis");
        lessons.add("Computer Architecture");

        student1.setLessons(lessons);

        Student student2 = new Student("Arda Orkun","Ulusoy",2001,"180209018",null);

        student2.setLessons(lessons);

        Student student3 = new Student("İbrahim Kerem","Gümüş",2000,"180209019",null);

        Student student4 = new Student("Berke Can","Pınar",2000,"180209020",null);


        StudentOperations studentOperations = new StudentOperations();

        studentOperations.addStudent(student1);
        studentOperations.addStudent(student2);
        System.out.println("************************************");
        studentOperations.listStudent();
        System.out.println("************************************");
        studentOperations.removeStudent(student2);
        studentOperations.listStudent();


    }
}
