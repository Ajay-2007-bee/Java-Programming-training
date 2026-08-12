package HwDay2;


public class SavingsBank extends BankService {

    void calculateInterest() {

        double interest = balance * 0.04;

        System.out.println("Savings Interest : " + interest);
    }

    void savingsAccount() {

        System.out.println("\nSAVINGS ACCOUNT");

        super.getCustomerDetails();

        super.deposit();

        calculateInterest();

        super.displayDetails();
    }
}