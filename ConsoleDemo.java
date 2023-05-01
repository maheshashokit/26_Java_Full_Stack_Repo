import java.io.Console;

public class ConsoleDemo {
	
	public static void main(String[] args) {
		
		//creating object for console class
		Console con = System.console();
		
		System.out.println("Enter Employee ID");
		String employeeId = con.readLine();
		System.out.println("Enter Employee Name");
		String employeeName =con.readLine();
		System.out.println("Enter Employee Salary");
		String empSalary = con.readLine();
		System.out.println("Enter Employee Password");
		char[] password = con.readPassword();
		
		System.out.println("Employee ID ::::" + employeeId);
		System.out.println("Employee Name ::::" + employeeName);
		System.out.println("Employee Salary ::::" + empSalary);
		System.out.println("Employee Salary ::::" + new String(password));
		
	
	}
}
