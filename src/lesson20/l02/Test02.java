package lesson20.l02;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        for (Object o : list) {
            System.out.println("number: " + o + " and length: " + ((String)o).length());
        }
    }
}
