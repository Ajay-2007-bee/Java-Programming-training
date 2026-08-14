package bank_app;

public class BankService {
	double currentBalance = 350000;
	long nums [] = {10029, 10002, 1004, 2030};

	void searchAccount (long accNo) throws AccountNotFoundException {

		boolean flag=false;
		for (long num: nums) {
			if (num == accNo) {
				System.out.println("Acount found");
				flag=true;
				break;

			}
	}

	if(!flag)
		throw new AccountNotFoundException("Account Not Found");
	}
	
	void withdrawl(float amount) throws InsufficiantBalanceException{
		if(amount > currentBalance) throw new InsufficiantBalanceException("Insufficiant balacne");
		currentBalance = currentBalance - amount;
		
	}
	void login(int cardNo , int pin) {
		if(cardNo == 12345678) {
			if(pin==2020) {
				System.out.println("logged in ...");
			}
			else {
				throws new InvalidPinException("Incorrect pin number")
				System.out.println(":)");
			}
		}
	}
}