package at.htlhl.sew2.oop.basics;

public class BankAccount {
    private int number;
    private float balance;

    public BankAccount() {

    }

    public BankAccount(int number, float balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("deposit() nicht durchgeführt!");
        }
    }

    public boolean withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("withdraw() nicht durchgeführt!");
            return false;
        }
    }

    public void transfer(BankAccount zielkonto, float amount) {
        boolean success = withdraw(amount);
        if (success) {
            zielkonto.deposit(amount);
        }
    }
}
