package bank_app;
import java.util.*;
public class BankPortal {

	public static void main(String[] args){

		Scanner sc=new Scanner (System.in);
		BankService service = new BankService();

		System. out.println (" --------------Bank Portal -----------------");
		System. out.println("1. Search Account \t2.Cash Withdrawl\t3. Login") ;
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
		System. out.println ("Type Account No : ");
		int accNo = sc.nextInt();
			try {
				service.searchAccount (accNo);
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			}

		break;
		}
	}

}
