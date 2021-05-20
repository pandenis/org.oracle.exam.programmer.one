package lesson17;

public class Homework1701 {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        String s1 = new String(sb1);
        String s2 = new String(sb2);

        return (s1.equals(s2));
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("1234");
        StringBuilder sb2 = new StringBuilder("1234");

        StringBuilder sb3 = sb2;

        StringBuilder sb4 = new StringBuilder("12345");

        System.out.println(equality(sb1, sb2));
        System.out.println(equality(sb2, sb3));
        System.out.println(equality(sb2, sb4));
    }
}
