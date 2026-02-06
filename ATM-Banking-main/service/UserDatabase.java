package service;

import java.util.ArrayList;
import java.util.List;
import model.UserAccount;

public class UserDatabase {
    private static List<UserAccount> users = new ArrayList<>();

    static {
        users.add(new UserAccount("123", "John Doe", "1111", 5000));
        users.add(new UserAccount("456", "Jane Smith", "2222", 7000));
        users.add(new UserAccount("789", "Alice Johnson", "3333", 10000));
        users.add(new UserAccount("2025", "Shree Kumbhar", "2303", 100000));
        users.add(new UserAccount("789", "Vinayak Ojha", "0101", 23000));
    }

    public static UserAccount getUser(String accNum, String pin) {
        for (UserAccount user : users) {
            if (user.getAccountNumber().equals(accNum) && user.getPin().equals(pin)) {
                return user;
            }
        }
        return null;
    }
}
