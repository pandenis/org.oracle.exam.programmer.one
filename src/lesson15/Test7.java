package lesson15;

public class Test7 {
    public static void main(String[] args) {

        int money = 100;
        do {
            System.out.println("Place your bet!");
            System.out.println("You fail!");
            money -= 10;

        } while (money > 50);
    }
}
