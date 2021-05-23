package lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bye");
        list.add("hello");
        list.add("ok");
        list.add(1,"HELLO");

        for (String string : list) {
            System.out.print(string + " ");
        }
    }
}
