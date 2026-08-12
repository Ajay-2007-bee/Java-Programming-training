package abstraction;


abstract class GrandParent{
	abstract void add();
}
abstract class Parent extends GrandParent{
	abstract void sub();
}
abstract class Child extends Parent{
	abstract void mul();
}


class Arith extends Child
{

	@Override
	void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	
}



public class AbstractClassExmaple2 {

	public static void main(String[] args) {

	}
}

