package lesson05;

public class Test20 {
    int sum (int a, int b, int c) {
        return a + b + c;
    }

    int avg(int a, int b, int c) {
        return sum(a, b, c) / 3;
    }
}

class Test21 {
    public static void main(String[] args) {
        Test20 test20 = new Test20();
        System.out.println(test20.sum(1, 2 , 3));
        System.out.println(test20.avg(20, 40, 60));
    }
}
