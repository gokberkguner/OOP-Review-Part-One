package encapsulationGetSet;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Gökberk");
        student1.setSurname("Güner");
        student1.setBirthDate(2000);
        student1.setId("180209017");

        System.out.println("Name: " + student1.getName());
        System.out.println("Surname: " + student1.getSurname());
        System.out.println("Birth Date: " + student1.getBirthDate());
        System.out.println("ID: " + student1.getId());

        System.out.println("*********************");

        Student student2 = new Student("Gökalp","Güner",2005,"180209018");

        System.out.println("Name: " + student2.getName());
        System.out.println("Surname: " + student2.getSurname());
        System.out.println("Birth Date: " + student2.getBirthDate());
        System.out.println("ID: " + student2.getId());

        System.out.println("*********************");

        System.out.println("Name: " + student2.getName() +
                " , Surname: " + student2.getSurname() +
                " , Birth Date: " + student2.getBirthDate() +
                " , ID: " + student2.getId());
    }
}

 
