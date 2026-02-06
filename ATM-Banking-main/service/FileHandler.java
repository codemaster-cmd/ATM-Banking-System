package service;

import model.Transaction;
import java.io.*;

public class FileHandler {

    public static void saveTransaction(String accNum, Transaction txn) {
        try (FileWriter writer = new FileWriter("transactions_" + accNum + ".txt", true)) {
            writer.write(txn.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving transaction.");
        }
    }

    public static void showTransactionHistory(String accNum) {
        try (BufferedReader reader = new BufferedReader(new FileReader("transactions_" + accNum + ".txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("No transaction history found.");
        }
    }
}
