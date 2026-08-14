package bank_app;

public class InsufficiantBalanceException extends Exception{
	public InsufficiantBalanceException(String msg) {
		super(msg);
	}
}
