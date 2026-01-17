package com.bank.main;

import java.util.Scanner;
import com.bank.model.Account;
import com.bank.service.BankService;

public class BankApp {

    public static void main(String[] args) {

        BankService service = new BankService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    service.createAccount(new Account(accNo, name, bal));
                    break;

                case 2:
                    service.viewAccounts();
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    Account acc = service.findAccount(accNo);

                    if (acc != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                        service.saveToFile();
                        System.out.println("Amount Deposited");
                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    acc = service.findAccount(accNo);

                    if (acc != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();

                        if (acc.withdraw(amt)) {
                            service.saveToFile();
                            System.out.println("Withdrawal Successful");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    acc = service.findAccount(accNo);

                    if (acc != null) {
                        System.out.println("Balance: " + acc.getBalance());
                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;

                case 6:
                    System.out.println("Thank You for Banking!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

