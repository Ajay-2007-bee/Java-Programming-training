package abstraction;



public class AbstractClassExample {

	public static void main(String[] args) {
		 Arithematic a = new Calculator();
		 int r = a.add(2, 30);
		 int t = a.sub(5098,876);
		 System.out.println(r + " " + t) ;
	} 
//Arithematic obj2 =  new Arithmatic ();  we cant create object fro abstract class
}
