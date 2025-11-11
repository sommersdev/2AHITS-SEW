package at.htlhl.sew2.oop.basics;

public class BankAccount {

    static void main() {
        BankAccount ba1 = new BankAccount(1, 7f);
        BankAccount ba2 = new BankAccount(2, 10f);
        BankAccount ba3 = new BankAccount(3, -1f);
        BankAccount ba4 = new BankAccount(4, 999f);
        BankAccount ba5 = new BankAccount(5, -999f);
        BankAccount[] accounts = {ba1, ba2, ba3, ba4, ba5};

        BankAccount smallestAccount = accounts[0];
        BankAccount highestAccount = accounts[0];

        for (BankAccount account : accounts) {
            if (account.getBalance() < smallestAccount.getBalance()) {
                smallestAccount = account;
            }
            if (account.getBalance() > highestAccount.getBalance()) {
                highestAccount = account;
            }
        }

        System.out.println(smallestAccount);
        System.out.println(highestAccount);
    }

    @Override
    public String toString() {
        return "BankAccount{" + "number=" + number + ", balance=" + balance + '}';
    }

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
