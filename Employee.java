public class Employee extends Person {

	public String employeeId;
	public String designation;
	public double salary;
	public String jobBand;

	public void setEmployeeDetails(String employeeId, String designation, double salary, String jobBand) {
		this.employeeId = employeeId;
		this.designation = designation;
		this.salary = salary;
		this.jobBand = jobBand;
	}

	public void displayEmployeeDetailsInfo() {
		System.out.println("*********Employee Information********************");
		System.out.println("Employee ID ::" + employeeId + " Designation ::" + designation + " Salary ::" + salary
				+ " JobBand ::" + jobBand);
	}
}