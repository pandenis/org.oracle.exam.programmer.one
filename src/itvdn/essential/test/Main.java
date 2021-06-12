package itvdn.essential.test;

public class Main {


    Main() {
        System.out.println("Main");
    }

    public static void main(String[] args) {
        Cc cc = new Cc();
    }
}

class Aa extends Main{

    public Aa() {
        System.out.println("Aa");
    }
}

class Bb extends Aa {
    Bb() {
        System.out.println("Bb");
    }
}

class Cc extends Bb {
    Cc() {
        System.out.println("Cc");
    }
}
