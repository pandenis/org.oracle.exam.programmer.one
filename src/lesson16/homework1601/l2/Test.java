package lesson16.homework1601.l2;

public class Test {
    public static void main(String[] args) {

        System.out.println("\n/-----------isBlank----------/");
        String s1 = "privet";
        System.out.println(s1.isBlank());

        String s2 = "   ";
        System.out.println(s2.isBlank());

        System.out.println("\n/-----------isEmpty----------/");
        String  s3 = "";
        String s4 = null;
        System.out.println(s3.isEmpty());
        //System.out.println(s4.isEmpty());

        System.out.println("\n/-----------strip----------/");
        String s5 = "   hello!   H  \n";
        System.out.println(s5.strip());
        System.out.println(s5.stripLeading());
        System.out.println(s5.stripTrailing());

    }
}
