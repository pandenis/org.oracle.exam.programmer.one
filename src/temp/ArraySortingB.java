package temp;

public class ArraySortingB {
    public int[] sorting(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 0; i < array.length-1; i++) {
                isSorted = true;
                if (array[i+1] > array[i]) {
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }
}
