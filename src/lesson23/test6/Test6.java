package lesson23.test6;

public class Test6 {
}

class Animal{
    static String showName() {
        return "Some Animal";
    }

    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {

    static String showName() {
        return "Mouse";
    }

    public static void main(String[] args) {
        Animal a = new Mouse();
        a.showInfo();
    }

}
