package itvdn.essential.test;




public class A {
    { //3
        System.out.println("In block1");
    }

    static {  //1
        System.out.println("In static block1");
    }

    A() { //2
        System.out.println("In constructor A");
    }

    { //4
        System.out.println("In block2");
    }

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
    }
}
