package MiniProject1;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final String FILE_NAME = "accounts.dat";

    // Save accounts to file
    public static void saveAccounts(ArrayList<BankAccount> accounts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(accounts);
        } catch (Exception e) {
            System.out.println("Error saving accounts.");
        }
    }

    // Load accounts from file
    public static ArrayList<BankAccount> loadAccounts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<BankAccount>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}

