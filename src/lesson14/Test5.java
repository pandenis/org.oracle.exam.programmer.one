package lesson14;

public class Test5 {
    public static void main(String[] args) {
        /*for (int i = 1; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }*/

        for (int i = 1; i < 100; i++) {
            if (i == 10) {
                System.out.println(" ");
                continue;
            }
            if (i % 55 == 0) {
                System.out.println("--");
                break;
            }

            System.out.println(i);
        }
    }
}
