package MiniProject1;

import java.io.Serializable;

public class BankAccount extends BankOperations implements Serializable {

    private static final long serialVersionUID = 1L;

    // Encapsulation (private variables)
    private int accountNumber;
    private String name;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Getters & setters (Encapsulation)
    public int getAccountNumber() { return accountNumber; }
    public String getName() { return name; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    // Polymorphism (Method Overloading)
    public void deposit(int amount) {
        deposit((double) amount);
    }

    // Overriding (runtime polymorphism)
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Amount Deposited: " + amount);
        } else {
            System.out.println(" Invalid amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println(" Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println(" Current Balance: " + balance);
    }

    @Override
    public void displayDetails() {
        System.out.println(" Account Details ");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name      : " + name);
        System.out.println("Balance   : " + balance);
    }
}
