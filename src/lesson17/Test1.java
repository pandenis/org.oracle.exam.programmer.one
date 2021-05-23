package lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1);
        StringBuffer sb2 = new StringBuffer("Good day!!!");
        System.out.println(sb2);
        StringBuffer sb3 = new StringBuffer(50);
        StringBuffer sb4 = new StringBuffer(sb2);
        System.out.println(sb2);

        System.out.println(sb1.length());
        System.out.println(sb2.length());

        System.out.println(sb2.charAt(3));

        System.out.println(sb2.indexOf("d"));
        System.out.println(sb2.indexOf("!"));
        System.out.println(sb2.indexOf("d", 4));

        System.out.println("\n/-----------substring------------/\n");
        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5, 8);
        System.out.println(s2);

    }

}
