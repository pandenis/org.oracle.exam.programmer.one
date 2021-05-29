package lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Homework2001 {

    public static ArrayList<String> abc(String ...s) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str: s) {
            if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
        }
        Collections.sort(arrayList);

        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = abc("q", "w", "e", "r", "t", "e", "w");

        for (String s : arrayList) {
            System.out.println(s);
        }


    }
}
