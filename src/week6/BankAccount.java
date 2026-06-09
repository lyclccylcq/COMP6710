package week6;

public class BankAccount {
    private int balance;
    public BankAccount(int initialDeposit) {
        this.balance = initialDeposit;
    }

    public void deposit(int amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
