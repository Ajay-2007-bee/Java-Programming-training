package inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		BankServicev1 b1 = new BankServicev1(100000007 , "AJAY" , 100000);
		b1.deposit(234567);
		b1.withdraw(1000);
		b1.printRecipt();
	}

}
