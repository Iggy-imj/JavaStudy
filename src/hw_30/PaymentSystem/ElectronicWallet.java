package hw_30.PaymentSystem;

public class ElectronicWallet implements PaymentSystem {
    private double balance;
    public String currency;

    public ElectronicWallet(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " " + currency);
        } else {
            System.out.println("Insufficient funds.");
        }

    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " " + currency);
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
