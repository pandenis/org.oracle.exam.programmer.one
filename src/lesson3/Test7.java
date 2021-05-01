package lesson3;

public class Test7 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = true;

        System.out.println(b1 ^ b2 ^ b3 ^ b4);

        boolean b5 = false;
        boolean b6 = false;
        boolean b7 = true;
        boolean b8 = false;

        System.out.println(b5 ^ b6 ^ b7 ^ b8);
    }
}
