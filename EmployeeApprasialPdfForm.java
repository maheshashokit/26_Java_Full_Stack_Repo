//Generating the Employee Apprasial Form using PDF
public class EmployeeApprasialPdfForm extends EmployeeApprasialForm {
	
	public String typeOfForm ="Employee Apprasial PDF Form";
	
	@Override
	public String getEmployeeForm() {
	   return "Employee ApprasialForm Generating as PDF.....";
	}
	
	public String getTypeOfForm() {
		return typeOfForm;
	}
}
