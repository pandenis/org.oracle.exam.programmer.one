package temp;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        for (Object o : list) {
            System.out.print("o = " + o + " ");
        }

        list.remove(obj2);

        System.out.println();

        for (Object o : list) {
            System.out.print("o = " + o + " ");
        }
    }
}
