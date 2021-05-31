package lesson22.homework2202;

public class Pet extends Animal {

    public Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    protected String name;
    private int tail = 1;
    private int paw = 4;

    public void run(){
        System.out.println("Pet run");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }

    public int getPaw() {
        return paw;
    }
}
