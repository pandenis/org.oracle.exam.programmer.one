package lesson15;

public class Test2 {
    public static void main(String[] args) {

        int money = 100;

        while (money > 0) {
            System.out.println("Place your bet!");
            System.out.println("You fail!");
            money -=10;
        }
    }
}
