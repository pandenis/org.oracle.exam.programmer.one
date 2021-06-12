package itvdn.essential.ex002.ex001;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        System.out.println(instance.protectedField);
        System.out.println(instance.publicField);
    }
}
