package inheritance;

import java.util.Scanner;

public class finalpayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. CREDIT CARD PAYMENT");
        System.out.println("2. NETBANKING PAYMENT");
        System.out.print("ENTER YOUR CHOICE : ");

        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
        case 1: CreditCardService credit = new CreditCardService();
            credit.payWithCredit();
            break;
        case 2:  NetbankingPayment net = new NetbankingPayment();
            net.payWithNetbanking();
            break;
        default:
            System.out.println("INVALID CHOICE");
        }
        sc.close();
    }
}