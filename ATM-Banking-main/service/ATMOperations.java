package service;

import model.Transaction;
import model.UserAccount;

import java.util.Scanner;

public class ATMOperations {
    private UserAccount user;
    private Scanner scanner;

    public ATMOperations(UserAccount user) {
        this.user = user;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n---- ATM Menu ----");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + user.getBalance());
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    FileHandler.showTransactionHistory(user.getAccountNumber());
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();
        user.deposit(amount);
        Transaction txn = new Transaction("Deposit", amount);
        FileHandler.saveTransaction(user.getAccountNumber(), txn);
        System.out.println("Deposit successful!");
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();
        if (user.withdraw(amount)) {
            Transaction txn = new Transaction("Withdrawal", amount);
            FileHandler.saveTransaction(user.getAccountNumber(), txn);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
