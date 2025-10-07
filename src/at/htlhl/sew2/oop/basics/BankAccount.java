package at.htlhl.sew2.oop.basics;

public class BankAccount {
    int number;
    float balance;

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        balance -= amount;
    }

    public void transfer(BankAccount zielkonto, float amount) {
        withdraw(amount);
        zielkonto.deposit(amount);
    }
}
