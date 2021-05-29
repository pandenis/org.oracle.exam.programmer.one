package lesson21;

public class Test3 {
    Test3() {
        System.out.println("The class was created!");
    }
    void Test3() {
        System.out.println("The class was created!");
    }
}

class A {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
    }
}
