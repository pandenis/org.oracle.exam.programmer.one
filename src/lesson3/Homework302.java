package lesson3;

public class Homework302 {
    public static void main(String[] args) {
        int a = 5;
        int r = a-- - --a + ++a + a++ + a;
             // 5   -   3 +   4 + 4   + 5
        System.out.println(r);
    }
}
