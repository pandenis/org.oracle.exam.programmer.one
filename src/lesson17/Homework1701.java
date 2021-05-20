package lesson17;

public class Homework1701 {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        String s1 = new String(sb1);
        String s2 = new String(sb2);

        return (s1.equals(s2));
    }

    public static boolean equality2(StringBuilder sb1, StringBuilder sb2) {
        boolean result = false;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                result = sb1.charAt(i) == sb2.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("1234");
        StringBuilder sb2 = new StringBuilder("1234");

        StringBuilder sb3 = sb2;

        StringBuilder sb4 = new StringBuilder("12345");
        StringBuilder sb5 = new StringBuilder("12345").reverse();

        boolean b = equality2(sb1, sb2);
        System.out.println(b);
        boolean b1 = equality2(sb2, sb3);
        System.out.println(b1);
        boolean b2 = equality2(sb4, sb5);
        System.out.println(b2);


        /*System.out.println(equality(sb1, sb2));
        System.out.println(equality(sb2, sb3));
        System.out.println(equality(sb2, sb4));*/
    }
}
