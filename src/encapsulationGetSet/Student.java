package encapsulationGetSet;

public class Student {

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
}

 
