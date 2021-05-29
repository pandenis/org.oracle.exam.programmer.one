package lesson20.l02;

import java.util.ArrayList;
import java.util.List;

public class Test01Sublist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println("list: " + list);

        List<String> sublist = list.subList(1, 4);

        System.out.println("sublist: " + sublist);
    }
}
