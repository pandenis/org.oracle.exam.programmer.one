package lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};

        for (int j : array1) {
            System.out.print(j + " ");
        }
        System.out.println();
        Arrays.sort(array1);

        for (int j : array1) {
            System.out.print(j + " ");
        }

        System.out.println();

        int index1 = Arrays.binarySearch(array1, -8);
        System.out.println(index1);

    }
}
