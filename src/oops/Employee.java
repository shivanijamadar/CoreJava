package oops;

public class Employee {
	public String Name;
	public int EmpId;
	public String Dept;
	
	//DefaultConstructor
	public Employee() {
		System.out.println("DefaultConstructor");
	}
	
	public Employee(String P1, int P2, String P3) {
		Name=P1;
		EmpId=P2;
		Dept=P3;
	}
	
	public void Display() {
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Dept);
	}
}
