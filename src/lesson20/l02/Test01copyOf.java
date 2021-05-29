package lesson20.l02;

import java.util.ArrayList;
import java.util.List;

public class Test01copyOf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        List<String> listCopy = List.copyOf(list);

        for (String s : listCopy) {
            System.out.println(s);
        }
    }
}
