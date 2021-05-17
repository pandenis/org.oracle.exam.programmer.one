package lesson16;

public class Test1 {

    public static void main(String[] args) {

        String s1 = new String("privet");

        int l = s1.length();
        System.out.println(l);

        char ch = s1.charAt(3);
        System.out.println(ch);

        System.out.println("\n/------indexOf--------/\n");

        int indexT = s1.indexOf("t");
        System.out.println(indexT);

        int indexVet = s1.indexOf("vet");
        System.out.println(indexVet);

        String s2 = new String("abcdefgabcd");

        int indexA = s2.indexOf("a", 5);
        System.out.println(indexA);

        System.out.println("\n/------startsWith--------/\n");

        //boolean startsAbc = s2.startsWith("abc", 5); //false
        boolean startsAbc = s2.startsWith("abc", 7); //false
        System.out.println(startsAbc);


        boolean startsAbc2 = s1.startsWith("abc");
        System.out.println(startsAbc2);

        System.out.println("\n/------endsWith--------/\n");

        boolean endsBcd = s2.endsWith("bcd");
        System.out.println(endsBcd);



    }
}
