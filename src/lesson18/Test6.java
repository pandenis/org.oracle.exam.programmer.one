package lesson18;

import java.util.Arrays;

public class Test6 {
    public static void sorMaxMin (int[] array) {
        Arrays.sort(array);
        System.out.println("Min element: " + array[0]);
        System.out.println("Max element: " + array[array.length - 1]);
    }

    public static void maxMin (int[] array) {
        int min = 0;
        int max = 0;

        for (int j : array) {
            if (j < min) {
                min = j;
            }

            if (j > max) {
                max = j;
            }
        }

        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        sorMaxMin(array1);

        maxMin(array1);
    }
}
