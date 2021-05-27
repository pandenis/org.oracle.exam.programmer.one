package lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bye");
        list.add("hello");
        list.add("ok");

        System.out.println(list.indexOf(new String("bye")));
    }
}
