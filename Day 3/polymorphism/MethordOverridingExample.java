package polymorphism;

import java.util.*;
class SwiggyV1{
	void sendOtp() {
		System.out.println("Type ur Email : ");
		System.out.println("OTP sent to mail , plz enter..");
	}
}
class SwiggyV2 extends SwiggyV1{
	Scanner s = new Scanner(System.in);
	
	void sendOtp() {
		System.out.println("\nCHOOSE : 1.otp to mobile  2.otp to mail");
		int choice = s.nextInt();
		if(choice == 1) {
		System.out.println("Type ur mobile : ");
		System.out.println("OTP sent to mobile , plz enter..");}
		else if (choice == 2) super.sendOtp();
	}
}
public class MethordOverridingExample {

	public static void main(String[] args) {
		SwiggyV1 s = new SwiggyV2();
		s.sendOtp();

	}

}
