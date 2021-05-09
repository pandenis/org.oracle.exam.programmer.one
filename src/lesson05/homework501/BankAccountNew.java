package lesson05.homework501;

public class BankAccountNew {

    public BankAccountNew(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    int id;
    String name;
    double balance;

    int refill(int sum) {
        return id += sum;
    }
}
