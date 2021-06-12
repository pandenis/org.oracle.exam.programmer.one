package temp.zoo;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.say();

        Tiger tiger = new Tiger("Tig", 2);
        tiger.sayTiger();
        tiger.say();
    }
}
