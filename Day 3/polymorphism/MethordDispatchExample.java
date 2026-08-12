package polymorphism;

class V1{
	void sendMessage() {
		System.out.println("Message send to 10 members..");
	}
}
class V2{
	@Override
	void sendMessage() {
		System.out.println("Message send to 20 members..");
	}
}


public class MethordDispatchExample {

	public static void main(String[] args) {
		
	}

}
