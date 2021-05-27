package lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test7 {

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list = new ArrayList<>();
        list.add(s3);
        list.add(s1);
        list.add(s4);
        list.add(s2);

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.next();
            iter.remove();
        }

        System.out.println("========================");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
