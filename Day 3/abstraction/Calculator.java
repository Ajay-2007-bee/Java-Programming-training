package abstraction;

class Calculator extends Arithematic{

	@Override
	int add(int a, int b) {
		super.display();
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		
		return a-b;
	}
	
	
	
}