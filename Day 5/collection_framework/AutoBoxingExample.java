package collection_framework;

public class AutoBoxingExample {

	public static void main(String[] args) {
		int num = 10;
		Integer num2 = Integer.valueOf(num); //converting ptmitive ot erapper 
		
		Integer num3 = num; //autoboxing (BTS it calls valueOf)
		System.out.println(num2 + " " + num3);
		int num4 = num3.intValue(); //wrapper class object to primitive data 
		System.out.println(num4);
		
	}

}
