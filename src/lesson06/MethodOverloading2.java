package lesson06;

public class MethodOverloading2 {
    int sum (int i, int j) {
        return i + j;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mo2 = new MethodOverloading2();
        int sum = mo2.sum(1, 4);
        System.out.println(sum);
        String hi_ = mo2.sum("Hi ", "my Friend!");
        System.out.println(hi_);
    }
}
