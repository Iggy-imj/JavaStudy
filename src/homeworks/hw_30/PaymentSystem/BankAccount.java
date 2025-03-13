package homeworks.hw_30.PaymentSystem;

public class BankAccount implements PaymentSystem {
    private double balance;
    public String currency;

    public BankAccount(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
         if (balance >= amount) {
             balance -= amount;
             System.out.println("Withdrawal " + amount + " " + currency);
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
