package lesson22.homework2202;

public class Animal {

    public Animal() {
        System.out.println("I am animal");
    }

    protected int eyes;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

    public int getEyes() {
        return eyes;
    }
}
