package MiniProject1;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    // Overriding method
    @Override
    public void displayDetails() {
        System.out.println("----- Savings Account -----");
        super.displayDetails();
    }
}

