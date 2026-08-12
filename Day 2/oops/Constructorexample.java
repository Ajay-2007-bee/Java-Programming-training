package oops;
class Employee{
	int empId;
	String empName;
	char gender;	
	Employee(){
		
	}
	
	Employee(int empId , String empName , char gender){
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		
	}
	void getEmployeeDetails() {
		System.out.println(this.empId+" "+this.empName+" "+this.gender);
	}
}
public class Constructorexample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001,"ajay" , 'M');
		e1.getEmployeeDetails();
		Employee e2 = new Employee();
		e2.getEmployeeDetails();
	}

}
