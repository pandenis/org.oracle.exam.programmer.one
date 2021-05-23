package lesson19;

public class Test7 {
    public static void main(String[] args) {
        String[] array = {"Hi", "Hello", "Ok"};

        /*for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }*/

        for (String s : array) {
            System.out.println(s);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
