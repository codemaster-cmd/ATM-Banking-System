package Main;

import model.UserAccount;
import service.ATMOperations;
import service.UserDatabase;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        UserAccount user = UserDatabase.getUser(accNum, pin);
        if (user != null) {
            ATMOperations ops = new ATMOperations(user);
            ops.start();
        } else {
            System.out.println("Invalid account number or PIN!");
        }
        sc.close();
    }
}
