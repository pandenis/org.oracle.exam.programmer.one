package lesson5;

public class Human {
    String name;
    Car3 car3;
    BankAccount bA;

    void  info() {
        System.out.println("Name is " + name + ". Color of the car is " + car3.color +
                ". Balance at the bank "  + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "David";
        human.car3 = new Car3("red", "V8");
        human.bA = new BankAccount(123, 24000.54);
        human.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }
    String  color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2) {
      id = id2;
      balance = balance2;
    }
    int id;
    double balance;
}
