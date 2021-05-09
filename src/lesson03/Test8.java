package lesson03;

public class Test8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int c = ++a - b*2; // 11 - 6

        System.out.println(c);

        c = (a-- - b) * 2;

        System.out.println(c); // 14
    }
}
