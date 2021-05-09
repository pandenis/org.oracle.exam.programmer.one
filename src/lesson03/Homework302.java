package lesson03;

public class Homework302 {
    public static void main(String[] args) {
        int a = 5;
        int r = a-- - --a + ++a + a++ + a;
             // 5   -   3 +   4 + 4   + 5
        System.out.println(r);

        int b = 8;
        System.out.println(++b); //9
        System.out.println(b++); //9
        System.out.println(++b); //10 + 1 = 11
        System.out.println(--b); //10
        int q = ++b - b++ + ++b - --b;

        System.out.println(q);
    }
}
