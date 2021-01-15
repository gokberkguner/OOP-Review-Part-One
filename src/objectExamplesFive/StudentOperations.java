package objectExamplesFive;

import java.util.ArrayList;

public class StudentOperations {

    private static ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){

        boolean status = students.add(student);

        if (status){
            System.out.println(student.getName() + " " + student.getSurname() + " added to list successfully.");
        }
        else {
            System.out.println("An error occurred while adding the student (" + student.getName() + " " + student.getSurname() + ") to the list.");
        }
    }

    public void removeStudent(Student student){

        boolean status = students.remove(student);

        if (status){
            System.out.println(student.getName() + " " + student.getSurname() + " removed from list successfully.");
        }
        else {
            System.out.println("An error occurred while removing the student (" + student.getName() + " " + student.getSurname() + ") from the list.");
        }
    }

    public void listStudent(){

        for (Student student : students){
            System.out.println(student);
        }
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        StudentOperations.students = students;
    }
}
