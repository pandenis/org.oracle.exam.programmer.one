package lesson06.homework301;

public class Summary {

    void sum(int a, int b, int c, int d, int e) {
        int s = a + b + c + d + e;
        System.out.println(s);
    }

    void sum(int a, int b, int c, int d) {
        this.sum(a, b, c ,d , 0);
    }

    void sum(int a, int b, int c) {
        this.sum(a, b, c ,0 , 0);
    }

    void sum(int a, int b) {
        this.sum(a, b, 0 ,0 , 0);
    }

    void sum(int a) {
        this.sum(a , 0, 0, 0, 0);
    }

    void sum() {
        this.sum(0, 0, 0, 0, 0);
    }
}

class Main {
    public static void main(String[] args) {
        Summary summary = new Summary();
        summary.sum();
        summary.sum(2); // 2
        summary.sum(2, 4); // 6
        summary.sum( 1, 2, 4); // 7
        summary.sum( 1, 2, 4, 1); // 8
        summary.sum( 1, 2, 4, 1, 10); // 18


    }
}
