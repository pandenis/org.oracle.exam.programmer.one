package lesson23.test61;

public class Test6 {
}

class Animal{
    //static
    String showName() {
        return "Some Animal";
    }

    void showInfoAboutAnimals() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {
    
    //static
    String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Animal a = new Mouse();
        a.showInfoAboutAnimals(); //method existing only for Animal type

        Mouse m = new Mouse();
        m.showInfoAboutAnimals();
        m.showInfoAboutMouse();

    }

}
