package lesson16;

public class Test2 {
    public static void main(String[] args) {

        String s2 = new String("abcdefgabcd");

        System.out.println("\n/--------substring---------/\n");
        String string = s2.substring(3);
        System.out.println(string);

        String string1 = s2.substring(3, 7);
        System.out.println(string1);

        String s3 = new String("   asdf  ffggg ddd   ");
        String string2 = s3.trim();
        System.out.println(string2);

        System.out.println(s2.length());
        String s4 = s2.substring(3, 11);
        System.out.println(s4);

        String s5 = new String("privet");

        System.out.println("\n/--------replace---------/\n");
        String s6 = s5.replace('p', 'P');
        System.out.println("Replaced: " + s6);

        String s7 = s5.replace("pri", "PRI");
        System.out.println("Replaced: " + s7);

        String s8 = "poka";
        String s9 = s8.replace('k', 'k');
        System.out.println(s8 == s9);
    }
}
