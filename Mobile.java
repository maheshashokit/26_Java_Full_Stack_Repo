
public class Mobile {
	
	private String model;
	private String brand;
	private float cost;
	
	//Defining the Non-Parameterized Constructor
	public Mobile() {
		System.out.println("Mobile Class Non-Parmaterized Constructor....");	
	}
	
	//Defining the Parameterized Constructor
	public Mobile(String model,String brand, float cost){
	   this.model = model;
	   this.brand = brand;
	   this.cost = cost;
	}
	
	//Defining the method for displaying Mobile Information
	public void mobileDetails() {
		System.out.println("Mobile Model :::::" + model);
		System.out.println("Mobile Brand :::::" + brand);
		System.out.println("Mobile Cost :::::" + cost);
	}
	
	public static void main(String[] args) {
		
		//creating object with some Mobile Information
		Mobile m = new Mobile("M31","Samsung",18000);
		//calling the mobileDetails Method
		m.mobileDetails();
		
		System.out.println("========================================");
		Mobile m1 = new Mobile("M21","Samsung",15000);
		m1.mobileDetails();
		
		System.out.println("========================================");
		Mobile m2 = new Mobile();
		m2.mobileDetails();
		
		
	}
}