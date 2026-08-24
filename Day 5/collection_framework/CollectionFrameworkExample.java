package collection_framework;


class Student <T>{
	private T rollNo;
	private T name;
	
	
	public Student(T rollNo , T name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public T getRollNo() {
		return rollNo;
	}
	
	public T getName() {
		return name;
	}
}
public class CollectionFrameworkExample {
	public static void main(String[] args) {
		Student s = new Student(1278974535, "ajay");
		Student s1 = new Student("CS123GH", "ash");
		System.out.println( s.getName() +  " " + s.getRollNo());
		System.out.println(s1.getName()+  " " + s1.getRollNo());
	}
}
