package lesson14;

public class Test6 {
    public static void main(String[] args) {
       Test6 test6 = new Test6();
       test6.time();
    }

    public  void time() {
       HOURS: for (int i = 0; i < 24; i++) {
           for (int j = 0; j < 60; j++) {
               if (i < 10) {
                   System.out.print("0" + i);
               } else {
                   System.out.print(i);
               }
               System.out.print(":");

               if (j < 10) {
                   System.out.println("0" + j);
               } else if (j == 59) {
                   System.out.println(j + "\n");
               } else {
                   System.out.println(j);
               }

               if (j == 25) {
                   break HOURS;
               }


           }
        }
    }
}
