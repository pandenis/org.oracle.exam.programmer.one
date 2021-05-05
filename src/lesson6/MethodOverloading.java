package lesson6;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
    }
    void show(boolean b1) {
        System.out.println(b1);
    }

  /*  void show(String s1) {
        System.out.println(s1);
    }*/

    void show(String s, int a) {
        System.out.println("String: " + s + " int: " + a);
    }
    void show(Object obj) {
        System.out.println(obj.toString());
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        int a = 500;
        methodOverloading.show(a);
        boolean b = true;
        methodOverloading.show(b);
        String s = "hi";
        methodOverloading.show(s);
        methodOverloading.show(s, a);

        methodOverloading.show(s);

    }
}
