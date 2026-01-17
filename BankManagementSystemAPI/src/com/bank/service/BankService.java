package com.bank.service;

import java.util.ArrayList;
import java.io.*;
import com.bank.model.Account;

public class BankService {

    ArrayList<Account> accounts = new ArrayList<>();
    private final String FILE_NAME = "accounts.txt";

    public BankService() {
        loadFromFile();
    }

    public void createAccount(Account acc) {
        accounts.add(acc);
        saveToFile();
        System.out.println("Account Created Successfully");
    }

    public void viewAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No Accounts Found");
        } else {
            for (Account a : accounts) {
                System.out.println(a);
            }
        }
    }

    public Account findAccount(int accNo) {
        for (Account a : accounts) {
            if (a.getAccountNo() == accNo) {
                return a;
            }
        }
        return null;
    }

    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Account a : accounts) {
                bw.write(a.getAccountNo() + "," + a.getName() + "," + a.getBalance());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving data");
        }
    }

    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int accNo = Integer.parseInt(data[0]);
                String name = data[1];
                double balance = Double.parseDouble(data[2]);

                accounts.add(new Account(accNo, name, balance));
            }
        } catch (IOException e) {
            System.out.println("Error loading data");
        }
    }
}
