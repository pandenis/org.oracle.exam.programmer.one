package lesson21;

public class Test5 {
    public static void main(String[] args) {
        Test5 test5 = new Test5();
        char c = 'a';
        test5.abc(c);
        System.out.println((int) c);
    }

    void abc(int i) {
        System.out.println(i);
    }
}
