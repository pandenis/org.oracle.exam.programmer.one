package lesson23;

public class A10 {
    String s1 = "Privet";
    static double d1 = 3.14;
    int summary (int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}

class B10 extends A10 {
    String s1 = super.s1 + ", you";

    @Override
    int summary(int... i) {
        int result = super.summary(i);
        System.out.println("Sum: " + result);
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}
