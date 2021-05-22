package lesson19;

public class Test2 {
/*    static void summary(int a, int b) {
        System.out.println(a + b);
    }

    static void summary(int a, int b, int c) {
        System.out.println(a + b);
    }*/

    static void summary(int ...a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        summary();

        summary(1, 2);
    }

}
