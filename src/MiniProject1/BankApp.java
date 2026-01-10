package MiniProject1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<BankAccount> accounts = FileHandler.loadAccounts();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositAmount();
                case 3 -> withdrawAmount();
                case 4 -> checkBalance();
                case 5 -> displayDetails();
                case 6 -> {
                    FileHandler.saveAccounts(accounts);
                    System.out.println("✅ Thank you! Data Saved.");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid option.");
            }
        }
    }

    // 1) Create account
    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double balance = sc.nextDouble();

        System.out.println("Select Account Type: 1) Savings 2) Current");
        int type = sc.nextInt();

        BankAccount acc;

        if (type == 1) {
            acc = new SavingsAccount(accNo, name, balance);
        } else {
            acc = new CurrentAccount(accNo, name, balance);
        }

        accounts.add(acc);
        FileHandler.saveAccounts(accounts);
        System.out.println("✅ Account Created Successfully!");
    }

    // Find account
    static BankAccount findAccount(int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNo)
                return acc;
        }
        return null;
    }

    // 2) Deposit
    static void depositAmount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount to Deposit: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
            FileHandler.saveAccounts(accounts);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    // 3) Withdraw
    static void withdrawAmount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount to Withdraw: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
            FileHandler.saveAccounts(accounts);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    // 4) Balance enquiry
    static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            acc.checkBalance();
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    // 5) Display account details
    static void displayDetails() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            acc.displayDetails();
        } else {
            System.out.println("❌ Account not found.");
        }
    }
}
