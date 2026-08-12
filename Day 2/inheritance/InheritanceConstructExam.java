package inheritance;

//class Y{
//	Y(){
//		System.out.println("Y constructir ...");
//	}
//}
//class Z extends Y{
//	
//	Z(){
//		System.out.println("Z constructir...");
//	}
//	
//}
class Y{
	int num;
	Y(int num){
		System.out.println("Y constructir ..."+num);
	}
}
class Z extends Y{
	
	Z(int num){
		super(num);
		System.out.println("Z constructir...");
	}
	
}
public class InheritanceConstructExam {

	public static void main(String[] args) {
		Z z = new Z(4);
	}

}
