package at.htlhl.sew2.oop.basics;

public class BankAccount {
    private final int number;
    private float balance;

    public BankAccount(int number, float balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return this.number;
    }

    public float getBalance() {
        return this.balance;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("deposit()  could not get executed because of an invalid amount!");
        }
    }

    public boolean withdraw(float amount) {
        if (amount <= 0 || amount > this.balance) {
            System.out.println("withdraw() could not get executed because of insufficient funds or invalid amount!");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void transfer(BankAccount target, float amount) {
        boolean success = this.withdraw(amount);
        if (success) {
            target.deposit(amount);
        }
    }
}
