package lesson18;

public class Test7 {
    public static void main(String[] args) {
        char[] chars = {'!', ':', '-', ';', ')', ' '};

        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(chars, 0, 1);

        System.out.println(sb);

        sb.insert(6, chars, 1, 3);

        System.out.println(sb);

        sb.insert(9, chars, 5, 1);

        System.out.println(sb);
    }
}
