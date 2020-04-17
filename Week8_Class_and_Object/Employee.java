package Week8_Class_and_Object;

public class Employee {

	public String employeename;
	public String jobTitle;
	public float salary;
	public int employeeID;
	
	public Employee() {
		employeename="";
		jobTitle="";
		salary=19000f;
		employeeID=0;
	}
	public Employee(String employeename, String jobTitle, float salary, int employeeID) {
		this.employeename = employeename;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.employeeID = employeeID;
	}
	
	public void showEmp() {
		
	}
	
	public  String getName() {
		return employeename;
	}
	
	public  String geJobTitle() {
		return jobTitle;
	}
	
	public  float getSalary() {
		return salary;
	}
	
	public  int getEmployeeID() {
		return employeeID;
	}
	
	
	
	
	
}
