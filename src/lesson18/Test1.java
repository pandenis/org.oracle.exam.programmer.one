package lesson18;

public class Test1 {
    public static void main(String[] args) {

        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array10;

        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];
        array10 = new int[3][];

        System.out.println(array2.length);

        array2[0] = "Hi";
        array2[1] = "Bye";
        array2[2] = "ok";

        array3[0][1] = 3.14;
        array3[2][1] = 4.14;

    }

}
