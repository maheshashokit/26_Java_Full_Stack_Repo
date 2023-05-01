
public class EmployeeApprasialFillablePdfForm extends EmployeeApprasialPdfForm{
	
	public String typeOfForm ="Employee Apprasial Fillable PDF Form";
	
	@Override
	public String getEmployeeForm() {
	   return "Employee ApprasialForm Generating Fillable PDF Form.....";
	}
	
	public String getTypeOfForm() {
		return typeOfForm;
	}

}
