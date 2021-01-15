package finalPart;

public class Student {

    public static final String university = "Uskudar University";

    private String name;

    private String surname;

    private int birthDate;

    private String id;

    public Student(){

    }

    public Student(String name, String surname, int birthDate, String id) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.id = id;
    }


    public static String getUniversity(){
        return university;
    }

    public static void setUniversity(String university){
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

    private void showAllInfos(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Education: " + university);
        System.out.println("ID: " + id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name ='" + name + '\'' +
                ", Surname ='" + surname + '\'' +
                ", Birth Date =" + birthDate +
                ", Education ='" + university + '\'' +
                ", ID ='" + id + '\'' +
                '}';
    }
}



