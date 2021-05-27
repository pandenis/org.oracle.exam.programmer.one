package lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bye");
        list.add("hello");
        list.add("ok");
        list.add(1,"HELLO");


        System.out.println("list.get(3): " +list.get(3));

        list.set(1, "Denis");

        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println("\n/____________________/");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tom");
        arrayList.add("Smith");

        list.addAll(arrayList);

        for (String s : list) {
            System.out.println(s + " ");
        }

        System.out.println();



/*
      list.remove("ok");

        for (String s : list) {
            System.out.print(s + " ");
        }
*/


    }
}
