package lesson18;

public class Homework1801 {

    public int[] sorting (int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                 if (array[i+1] < array[i]) {
                     isSorted = false;

                     int temp = array[i];
                     array[i] = array[i+1];
                     array[i+1] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Homework1801 hw = new Homework1801();
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] arraySorted = hw.sorting(array1);

        for(int i: arraySorted) {
            System.out.println(i);
        }
    }
}
