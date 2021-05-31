package lesson22.homework2202;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Gav");
        int dogPaw = dog.getPaw();
        System.out.println("The dog " + dog.getName() + " has " + dogPaw + " paws");

        Cat cat = new Cat("May");
        cat.sleep();
    }
}
