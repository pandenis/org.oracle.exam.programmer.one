package lesson15;

public class Test4 {

    public static void main(String[] args) {
        int a = 5;
      /*//case1:  a = 6;
        while (++a > 10) {
            a++;
        }*/

        /*//case 2
        while (++a < 10) {
            a++;
        }*/

        //case 3: 5,
        while (a++ < 10) { // 6 8 10 after comparison 12
            a++;           // 7 9 11
        }
        System.out.println(a);
    }
}
