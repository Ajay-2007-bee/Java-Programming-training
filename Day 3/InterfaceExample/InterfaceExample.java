package InterfaceExample;

public class InterfaceExample {

	public static void main(String[] args) {
		Arithematic a = new Calculator();
		int r = a.add(4, 4);
		int t = a.sub(56, 7);
		System.out.println(r + " " + t);
	}
}
