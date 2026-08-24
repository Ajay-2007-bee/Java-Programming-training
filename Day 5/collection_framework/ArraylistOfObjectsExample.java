package collection_framework;

import java.util.ArrayList;

import java.util.List;

class Employee{
	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	

}

public class ArraylistOfObjectsExample {
	public static void main(String[] args) {
		List<Employee> allEmployees = new ArrayList<>();
		allEmployees.add(new Employee (1001 , "ajay"));
		allEmployees.add(new Employee (1002 , "ash"));
		allEmployees.add(new Employee (1001 , "kong"));
		
		for(Employee emp : allEmployees) {
			System.out.println(emp);
		}
	}
}
