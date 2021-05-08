package lesson8;

public class Test1 {
    public final int a;

    public Test1() {
        a = 10;
    }

    public Test1(boolean b) {
        a = 15;
    }
    public void abc(short s) {
        final byte b = 10;
        System.out.println(s + b);

    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.a);
        Test1 test1b = new Test1(true);
        System.out.println(test1b.a);
    }
}
