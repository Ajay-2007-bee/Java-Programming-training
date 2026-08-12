package HwDay2;

import java.util.Scanner;

public class BankService {

    String customerName;
    long accountNumber;
    double balance;

    Scanner sc = new Scanner(System.in);

    void getCustomerDetails() {

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance = balance + amount;

        System.out.println("Amount Deposited Successfully");
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {

        System.out.println("\nCustomer Name : " + customerName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}