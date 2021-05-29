package lesson20.l02;

import java.util.ArrayList;

public class Test01toArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Object[] array = list.toArray();
        String[] array2 = list.toArray(new String[list.size()]);

        for (String string : array2) {
            System.out.println(string);
        }
    }
}
