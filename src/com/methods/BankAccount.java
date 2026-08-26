package com.methods;

public class BankAccount {
    long accountNumber;
    String customerName;
    double balance;

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public void transfer(double amount, BankAccount anotherAccount) {
        balance -= amount;
        anotherAccount.balance += amount;
    }

    public double calculateInterest(double interestRate) {
        return (balance * interestRate) / 100;
    }

   void display() {
        System.out.println("------------------------------------");
        System.out.println("         ACCOUNT DETAILS            ");
        System.out.println("------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 9876543210L;
        acc1.customerName = "Aditya";
        acc1.balance = 5000.0;
        
        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = 1234567890L;
        acc2.customerName = "Ratnakar";
        acc2.balance = 2000.0;
        
        System.out.println("=== INITIAL ACCOUNT STATUS ===");
        acc1.display();
        acc2.display();
        
        acc1.deposit(1000.0);
        acc1.withdraw(500.0);
        acc1.transfer(1500.0, acc2);
        
        System.out.println("=== STATUS AFTER TRANSACTIONS ===");
        acc1.display();
        acc2.display();
    }
}