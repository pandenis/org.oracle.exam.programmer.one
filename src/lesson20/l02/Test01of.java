package lesson20.l02;

import java.util.ArrayList;
import java.util.List;

public class Test01of {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        List<String> listOf = List.of("odin", "dva", "tri");

        for (String s : listOf) {
            System.out.println(s);
        }

        //listOf.add("chetire"); - UnsupportedOperationException
    }
}
