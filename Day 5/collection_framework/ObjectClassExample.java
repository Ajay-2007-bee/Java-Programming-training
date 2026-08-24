package collection_framework;
class Student1
{
	int rollno;
	String name;
	String dept;
	public Student1 (int rollno, String name, String dept) {
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
	}
	
	void getDetails(){
		System.out.println(rollno+" "+name+" "+dept);
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", dept=" + dept + "]";
	}
}
public class ObjectClassExample {
	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "ajay", "cse");
				System.out.println(s1);
				s1.getDetails();
				System.out.println(s1.getClass());
				System.out.println(s1.toString());
	}
}
