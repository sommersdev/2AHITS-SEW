package at.htlhl.sew2.oop.basics;

public class Main {
    static void main() {
        System.out.println("Basic OOP started ...");

        BankAccount accOfGojko = new BankAccount(123789, 10000f);
        accOfGojko.deposit(220f);
        System.out.println("Actual balance(Gojko): " + accOfGojko.getBalance());

        BankAccount accOfFlorian = new BankAccount(456000, 0.10f);

        System.out.println("Actual balance(Florian): " + accOfFlorian.getBalance());

    }
}
