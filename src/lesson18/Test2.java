package lesson18;

public class Test2 {
    public static void main(String[] args) {
        int[][] array2 = new int[3][];

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
            }
        }
        int[] array3;
       // array3 = {1, 2, 3};
        int[] array4 = {1, 2,3};

    }

}
