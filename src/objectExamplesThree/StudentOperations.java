package objectExamplesThree;

import java.util.ArrayList;

public class StudentOperations {

    public void showStudentInfos(Student student){

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Birth Date: " + student.getBirthDate());
        System.out.println("Education: " + Student.getUniversity());
        System.out.println("ID: " + student.getId());
        System.out.println("Lessons: " + student.getLessons());

    }

    public void searchStudentsLesson(Student student, String lesson){

        boolean status = true;

        ArrayList<String> lessons = student.getLessons();

        for (String l : lessons){

            if (l.equals(lesson)){
                System.out.println("The lesson that you searched is taken by " + student.getName() + " " + student.getSurname() + ".");
                status = false;
                break;
            }

        }
        if (status){
            System.out.println("The lesson that you searched is not taken by " + student.getName() + " " + student.getSurname() + ".");

        }

    }

}

 
