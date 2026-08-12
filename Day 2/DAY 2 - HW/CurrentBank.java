package HwDay2;


public class CurrentBank extends BankService {

    void calculateOverdraft() {

        double overdraftLimit = 50000;

        System.out.println("Overdraft Limit : " + overdraftLimit);
    }

    void currentAccount() {

        System.out.println("\n===== CURRENT ACCOUNT =====");

        super.getCustomerDetails();

        super.deposit();

        calculateOverdraft();

        super.displayDetails();
    }
}