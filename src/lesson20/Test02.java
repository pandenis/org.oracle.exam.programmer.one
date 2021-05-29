package lesson20;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};

        char[] chars1 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] chars2 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};

        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array1, array2));

        System.out.println(Arrays.mismatch(array1, array2));
        System.out.println(Arrays.mismatch(chars1, chars2));
    }
}
