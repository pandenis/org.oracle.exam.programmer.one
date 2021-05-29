package temp;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUsage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
