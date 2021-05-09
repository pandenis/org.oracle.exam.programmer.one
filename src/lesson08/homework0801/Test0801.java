package lesson08.homework0801;

public class Test0801 {
    public static String multiply(int a, int b, int c) {
        return "The multiply is: " + (a * b * c);
    }

    public static void devise(int a, int b) {
        int d = a / b;
        int m = a % b;
        System.out.println("Quotient of division " + a + " and " + b + " is: " + d + " and remainder is: " + m);
    }
}
