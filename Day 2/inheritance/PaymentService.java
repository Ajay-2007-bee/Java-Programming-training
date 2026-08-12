package inheritance;
import java.util.*;

public class PaymentService {
	private long number;
	private int otp;

	Scanner sc = new Scanner(System.in);
	
	void generateOTP() {
		System.out.println("ENTER MOBILE NO : ");
		this.number = sc.nextLong();
		
		Random ran = new Random();
		this.otp = 1000 + ran.nextInt(9000);
		System.out.println("OTP generated successfully.");
        System.out.println("Your OTP is: " + this.otp);
	}
	
	 boolean verifyOTP(int userOTP) {

	        if (userOTP == otp) {
	            return true;
	        } else {
	            return false;
	        }
	 }
	
}
