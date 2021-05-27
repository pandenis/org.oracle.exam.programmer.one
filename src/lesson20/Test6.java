package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

/*        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();

        list1.get(0).append("!");
        list1.set(0, new StringBuilder("D"));
        System.out.println(list2.get(0));*/
  
/*        Object[] array1 = list1.toArray();

        for (Object o : array1) {
            System.out.println(o);
        }

        System.out.println("----------------------");

        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);

        for (StringBuilder stringBuilder : array2) {
            System.out.println(stringBuilder);
        }
        */
        StringBuilder [] array = {sb1, sb2, sb3};
        List<StringBuilder> list = Arrays.asList(array);

        for (StringBuilder sb : list) {
            System.out.println(sb);
        }

        array[0].append("!!!");

        System.out.println(list);
        array[0] = new StringBuilder("F");

        System.out.println(list);



    }
}
