package lesson20.l02;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();

        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 = " + al1);
/*
        ArrayList<String> al2 = new ArrayList<>();

        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");*/

/*        al1.removeAll(al2);

        System.out.println("al1 = " + al1);*/

        List <String> subList = al1.subList(1, 4);
        System.out.println("subList = " + subList);
        subList.add("ten");

        System.out.println("al1 = " + al1);
        System.out.println("subList = " + subList);





    }
}
