package MiniProject1;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    // Overriding method
    @Override
    public void displayDetails() {
        System.out.println("----- Current Account -----");
        super.displayDetails();
    }
}
