package inheritance;

public class CreditCardService extends PaymentService {

    void payWithCredit() {

        super.generateOTP();

        System.out.print("ENTER OTP : ");
        int userOTP = sc.nextInt();

        if (super.verifyOTP(userOTP)) {
            System.out.println("CREDIT CARD PAYMENT VERIFIED SUCCESSFULLY");
        } else {
            System.out.println("INVALID OTP - CREDIT CARD PAYMENT NOT VERIFIED");
        }
    }
}