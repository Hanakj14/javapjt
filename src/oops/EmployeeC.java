package oops;

public class EmployeeC {
	int empid;
	String empname;
	public EmployeeC(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		
	}
	
	public void display() {
		System.out.println("Employee id="+empid);
		System.out.println("Employee name="+empname);
		
	}

	public static void main(String[] args) {
		EmployeeC emp=new EmployeeC(10,"rigved");
		System.out.println(emp.empid);
		System.out.println(emp.empname);
		
		
	}

}
