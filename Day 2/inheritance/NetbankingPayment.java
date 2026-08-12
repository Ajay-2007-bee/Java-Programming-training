package inheritance;

public class NetbankingPayment extends PaymentService {

    void payWithNetbanking() {

        super.generateOTP();

        System.out.print("ENTER OTP : ");
        int userOTP = sc.nextInt();

        if (super.verifyOTP(userOTP)) {
            System.out.println("NETBANKING PAYMENT VERIFIED SUCCESSFULLY");
        } else {
            System.out.println("INVALID OTP - NETBANKING PAYMENT NOT VERIFIED");
        }
    }
}