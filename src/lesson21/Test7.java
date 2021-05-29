package lesson21;

public class Test7 {

    public void abc(int a, int b) {
        System.out.println("hi i");
    }

    public void abc(double a, double b) {
        System.out.println("hi d");
    }

    public void abc(int a, double b) {
        System.out.println("hi i, d");
    }

    public static void main(String[] args) {
        Test7 test7 = new Test7();

        test7.abc(1, 3);
    }
}
