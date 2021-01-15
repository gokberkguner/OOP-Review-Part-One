package staticPart;

public class StudentTest {
    public static void main(String[] args) {

        Student.setUniversity("Uskudar University");

        Student student1 = new Student();

        student1.setName("Gökberk");
        student1.setSurname("Güner");

        Student student2 = new Student();

        student2.setName("Gökalp");
        student2.setSurname("Güner");

        System.out.println("- Student 1 Infos -");
        System.out.println("Name: " + student1.getName() +
                ", Surname: " + student1.getSurname() +
                ", Education: " + Student.getUniversity());

        System.out.println("*************************************************************");

        System.out.println("- Student 2 Infos -");
        System.out.println("Name: " + student2.getName() +
                ", Surname: " + student2.getSurname() +
                ", Education: " + Student.getUniversity());
    }
}

 
