package hw_30.PaymentSystem;

public interface PaymentSystem {
    void  withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
    //void transferMoney(PaymentSystem recipient, double amount);
}
