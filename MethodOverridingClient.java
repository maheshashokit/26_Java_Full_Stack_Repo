
public class MethodOverridingClient {
	
	public static void main(String[] args) {
		
	   //creating the sub class object and holding into parent class
	   EmployeeApprasialForm epf  = new EmployeeApprasialPdfForm();
	 
	   //calling the methods and variables
	   System.out.println(epf.getTypeOfForm());//html form 
	   System.out.println(epf.getEmployeeForm());//PDF form 
	   
	   epf = new EmployeeApprasialFillablePdfForm();	   
	   //calling the methods and variables
	   System.out.println(epf.getTypeOfForm());//html form 
	   System.out.println(epf.getEmployeeForm());//Fillable form 
	   
	   epf = new EmployeeApprasialForm();
	   System.out.println(epf.getTypeOfForm());
	   System.out.println(epf.getEmployeeForm()); 
	}
}