
public class Vendor {
	
	private int id;
	private String name;
	private String location;
	
	//Defining the Non-Parameterized Constructor
	public Vendor() {
		System.out.println("Non-Parameterized Constructor.....");
		id = 01;
		name= "AshokIT";
		location ="Hyderabad";
	}
	
	//Defining the parameterized constructor
	public Vendor(int vId,String vName,String vLocation) {
		id = vId;
		name = vName;
		location = vLocation;
	}
	
	//Defining the Parameterized Constructor which accepting Vendor as parameter
	public Vendor(Vendor v1) {
		id = v1.id;
		name = v1.name;
		location = v1.location;
	}
	
	public void displayVendorInformation() {
		System.out.println("Vendor ID       ::::::" + id);
		System.out.println("Vendor Name     ::::::" + name);
		System.out.println("Vendor Location ::::::" + location);
	}
	
	public static void main(String[] args) {
		
		//creating the object for Vendor Class
		Vendor v = new Vendor();
		v.displayVendorInformation();
		
		System.out.println("==============================================");
		Vendor v1 = new Vendor(02,"Mahesh","Bangalore");
		v1.displayVendorInformation();
		
		System.out.println("===============================================");
		Vendor v2 = new Vendor(v1);
		v2.displayVendorInformation();	
	}
}
