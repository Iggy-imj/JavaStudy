package homeworks.hw_30.PaymentSystem;

public class Application {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000, "EUR");
        ElectronicWallet wallet = new ElectronicWallet(500, "USD");

        System.out.println("Bank Balance: " + bankAccount.checkBalance() + " " + bankAccount.currency);
        bankAccount.withdrawMoney(200);
        System.out.println("Bank Balance after withdrawal: " + bankAccount.checkBalance() + " " + bankAccount.currency);
        bankAccount.depositTransfer(150);
        System.out.println("Bank Balance after deposit: " + bankAccount.checkBalance() + " " + bankAccount.currency);

        System.out.println("\n=============================\n");

        System.out.println("Bank Balance: " + wallet.checkBalance() + " " + wallet.currency);
        wallet.withdrawMoney(300);
        System.out.println("Bank Balance after withdrawal: " + wallet.checkBalance() + " " + wallet.currency);
        wallet.depositTransfer(210);
        System.out.println("Bank Balance after deposit: " + wallet.checkBalance() + " " + wallet.currency);

        wallet.withdrawMoney(1000);






    }
}
