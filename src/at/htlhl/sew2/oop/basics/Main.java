package at.htlhl.sew2.oop.basics;

public class Main {
    static void main() {
        System.out.println("Basic OOP started ...");

        BankAccount accOfGojko = new BankAccount();
        accOfGojko.number = 123789;
        accOfGojko.balance = 10000f;

        BankAccount accOfFlorian = new BankAccount();
        accOfFlorian.number = 456000;
        accOfFlorian.balance = 0.10f;

        accOfGojko.deposit(100f);

        System.out.println("Actual balance: " + accOfGojko.balance);
        System.out.println("Actual balance(Florian): " + accOfFlorian.balance);
    }
}
