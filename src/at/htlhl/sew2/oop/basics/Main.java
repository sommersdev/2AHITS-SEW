package at.htlhl.sew2.oop.basics;

public class Main {
    static void main() {
        System.out.println("Basic OOP started ...");

        BankAccount accOfGojko = new BankAccount();
        accOfGojko.setNumber(123789);
        accOfGojko.setBalance(10000f);

        BankAccount accOfFlorian = new BankAccount();
        accOfFlorian.setNumber(456000);
        accOfGojko.setBalance(0.10f);

        accOfGojko.deposit(100f);

        System.out.println("Actual balance: " + accOfGojko.getBalance());
        System.out.println("Actual balance(Florian): " + accOfFlorian.getBalance());
    }
}
