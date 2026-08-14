package exception_handling;
import java.util.*;
public class ExceptionIssue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER NO :");
		int num = s.nextInt();
		System. out.println("line 1");
		System.out.println("line 2");
		System. out.println("line 3");
		System. out.println("line 4");
		try {
		  System.out.println(10/ num);
		}
		catch(ArithmeticException dic) {
			System.out.println("Cannot divide by zero : "+ "["+ dic +"]");
		}  
		  //exception handling is a mechanism to handle runtime errors so that the
	
		System.out.println("line 5");     // normal flow of  the program can continue instead of terminating unexpectedly
		System. out.println("line 6");
		System.out.println("line 7");
		System.out.println("line 8");   // expection is run time error and can be handled  
		                                // but error can be handled
		                                // exceotion has two types complie rime exception adn run time exception
	}
}
