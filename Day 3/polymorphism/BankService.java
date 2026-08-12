package polymorphism;

import java.util.Scanner;

public class BankService {

    double currentBalance = 2000.00;

    void deposit(String empId, long chequeNo, float amount) {
        currentBalance = currentBalance + amount;

        System.out.println("\n--YOUR BILL--\n" + "Amount : " + amount);
        System.out.println("Employee ID : " + empId);
        System.out.println("Cheque Number : " + chequeNo);
        System.out.println("Amount deposited successfully using cheque...");
        System.out.println("Current Balance : " + currentBalance);
    }

    void deposit(String upiId, int upiPin, float amount) {
        currentBalance = currentBalance + amount;

        System.out.println("\n--YOUR BILL--\n"+ "Amount : " + amount);
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount transferred successfully using upi ...");
        System.out.println("Current Balance : " + currentBalance);
    }

    void deposit(long custId, String password, float amount) {
        currentBalance = currentBalance + amount;

        System.out.println("\n--YOUR BILL--\n"+ "Amount : " + amount);
        System.out.println("Netbanking ID : " + custId);
        System.out.println("Amount transferred successfully using netbanking...");
        System.out.println("Current Balance : " + currentBalance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        System.out.println("AMOUNT DEPOSIT PORTAL");
        System.out.println("1.Deposit through Cheque");
        System.out.println("2.Deposit through UPI");
        System.out.println("3.Deposit through Netbanking");

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

        case 1: System.out.print("Enter Employee ID : ");
            String empId = sc.nextLine();
            System.out.print("Enter Cheque Number : ");
            long chequeNo = sc.nextLong();
            System.out.print("Enter Amount : ");
            float chequeAmount = sc.nextFloat();
            bank.deposit(empId, chequeNo, chequeAmount);
            break;

        case 2:
            System.out.print("Enter UPI ID : ");
            String upiId = sc.nextLine();
            System.out.print("Enter UPI PIN : ");
            int upiPin = sc.nextInt();
            System.out.print("Enter Amount : ");
            float upiAmount = sc.nextFloat();
            bank.deposit(upiId, upiPin, upiAmount);
            break;

        case 3:
            System.out.print("Enter Customer ID : ");
            long custId = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter Netbanking Password : ");
            String password = sc.nextLine();
            System.out.print("Enter Amount : ");
            float netAmount = sc.nextFloat();
            bank.deposit(custId, password, netAmount);
            break;

        default:
            System.out.println("NOT A VALID CHOICE..");
        }
        sc.close();
    }
}

