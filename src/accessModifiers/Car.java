package accessModifiers;

public class Car {

    String brand;

    String model;

    String color;

    int year;


    Access Modifiers;
        - Public
        - Private
        - Protected


    public Car(String br, String mo){

        brand = br;
        model = mo;

    }

    // Constructor - Yapılandırıcı
    public Car(String br, String mo, String co, int ye){

        brand = br;
        model = mo;
        color = co;
        year = ye;

    }
}

