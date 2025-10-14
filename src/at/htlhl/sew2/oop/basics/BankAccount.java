package at.htlhl.sew2.oop.basics;

public class BankAccount {
    private int number;
    private float balance;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

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
