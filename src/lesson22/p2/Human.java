package lesson22.p2;

public class Human {
/*    public Human(String name) {
        this.name = name;
    }*/

    public Human(String name) {
        this(name, null);
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String name;
    String surname;

}

