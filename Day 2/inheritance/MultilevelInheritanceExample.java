package inheritance;

class A{
	int num1;
	int add(int a, int b) {
		return a+b;
	}
}
class B extends A{
	int num2;
	int mul(int a, int b) {
		return a*b;
	}
}

class C extends B{
	void calc() {
		super.num1=7;
		super.num2=22;
		System.out.println("Addition : "+ super.add (num1, num2) ) ;
		System.out.println("Multiplication : "+ super.mul(num1, num2) );

		}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		C c1 = new C();
		c1.calc();
	}

}
