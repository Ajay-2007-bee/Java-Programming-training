package exception_handling;
import java.util.Scanner;

import java.util.*;

class Instagram{
	static void createAccount() throws InvalidAgeException {
		Scanner s = new Scanner(System.in);
		System.out.println("type ur age : ");
		int age = s.nextInt();
		
		if(age<18) {
			throw new InvalidAgeException("Invalid Age, Age must be >18");	
		}
		System.out.println("Account created Successfully.....");
	}
}
public class CustomExceptionExample {

	public static void main(String[] args) {
		try {
			Instagram.createAccount();
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("rest of the code....");

	}

}
