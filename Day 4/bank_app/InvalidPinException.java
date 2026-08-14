package bank_app;

public class InvalidPinException extends Exception{
	public InvalidPinException(String msg) {
		super(msg);
	}
}
