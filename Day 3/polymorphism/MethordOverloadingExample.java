package polymorphism;

class signup{
	private String username;
	private String pass;
	private String name;
	private String addresss;
	private String googleToken;
	
	

	signup(String username, String pass, String name, String addresss) {
		this.username = username;
		this.pass = pass;
		this.name = name;
		this.addresss = addresss;
	}
	signup(String googleToken){
		this.googleToken  = googleToken;
	}
//	int add(int a , int b ) {
//		return a+b;
//	}
//	int add(int a , int b , int c) {
//		return a+b+c;
//	}
	
	void signin(String username, String pass , String name , String address) {
		if(this.username == username && this.pass == pass) {
			System.out.println("login succesfull using normal signin");
		}
	}
	void signin(String googleToken) {
		if(this.googleToken == googleToken) {
			System.out.println("login successfull using google signin");
		}
	}
}
public class MethordOverloadingExample {

	public static void main(String[] args) {
	   signup s = new signup("ajay2007", "2007", "ajay", "coimbatore");
	   signup s1 = new signup("cwefq");	   
	   s.signin("ajay2007", "2007", "ajay", "coimbatore");
	   s1.signin("cwefq");
	}

}
