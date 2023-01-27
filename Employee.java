//Constructor ------------

package CipherSchoolCourse;

public class Employee {
	
	int employeeId;
	int salary;
	String dept;
	
	Employee(){
		employeeId = 101;
		salary= 30000;
		dept = "testing";
	}
	public static void main(String[] args) {
		Employee rahul = new Employee();
		System.out.println(rahul.employeeId+" Salary "+rahul.salary+" Dept "+rahul.dept);
	}
}
