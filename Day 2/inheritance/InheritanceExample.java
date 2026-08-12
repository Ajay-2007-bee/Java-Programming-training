package inheritance;

class Parent{
	int a , b ;
	int add(int x , int y ) {
		return x+y;
	}
	void display() {
		System.out.println("hello iam parent .");
	}
}

class Child extends Parent{
	void calc() {
		super.a = 10;
		super.b = 20;
		int c = add(super.a,super.b);
		System.out.println("Addition :" + c);
	}
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		Child c = new Child();
		c.calc();
		c.display();
	}

}
