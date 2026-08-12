package inheritance;


	
public class BankServicev1 {
	long accNo;
	String accName;
	int balance;
	public BankServicev1(long accNo , String accName , int balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	void deposit (float amount)
	{
		System. out.println ("Amount "+amount+" deposited to "+this.accNo) ;
	}

	void withdraw (float amount) {
		System. out.println("Amount "+amount+" withdrawn from "+this.accNo) ;
	}

	void printRecipt () {
		System. out.println ("\n" + "Account No : "+ this.accNo);
		System. out.println("Account Holder Name : " + this.accName ) ;
		System. out.println ("Balance : "+ this.balance) ;

	}
}
