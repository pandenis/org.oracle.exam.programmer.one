package lesson17;

public class Test101 {

    public static void main(String[] args) {
        StringBuffer sb2 = new StringBuffer("Good day!!!");
        CharSequence cs = sb2.subSequence(5, 8);
        System.out.println(cs);

        sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2 );
        StringBuffer sb10 = new StringBuffer("Hello World");
        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Hello Everybody!");
        sb12.replace(0 , 5, "Hi");
        System.out.println(sb12);
        System.out.println(sb12.capacity());
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
    }
}
