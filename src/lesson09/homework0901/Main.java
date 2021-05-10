package lesson09.homework0901;

public class Main {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        Test1 t3 = new Test1();
        Test1 t4 = new Test1();
        Test1 t5 = new Test1();
        Test1 t6 = new Test1();
        Test1 t7 = new Test1();
        Test1 t8 = new Test1();

        t1 = t2;
        t3 = t2;
        t5 = t2;
        t7 = t8;
        t4 = t2;
        t6 = t4;


        t1.printer();
        t2.printer();
        t3.printer();
        t4.printer();
        t5.printer();
        t6.printer();
        t7.printer();
        t8.printer();


    }
}
