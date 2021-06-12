package temp.zoo;

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("It's an animal!");
    }
}
