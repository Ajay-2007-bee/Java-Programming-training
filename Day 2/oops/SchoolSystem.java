package oops;

class Student
{
	int rollno;
	String name;
	int age;
	String gender;
	void setval(int rollno , String name , int age , String gender) {
		this.rollno = rollno;
		this.name = name; 
		this.age = age;
		this.gender = gender;
	}

}

public class SchoolSystem {

public static void main(String[] args) {
	
	Student s1 = new Student();
	s1.setval(1001,"ajay" , 19 , "male");
	//s1.rollno =1001;
	//s1.name="ajay";
	//s1.age=19;
	//s1.gender="male";
	System.out.println(s1.rollno+" "+s1.name+" "+s1.age+" "+s1.gender);
	
 }
}