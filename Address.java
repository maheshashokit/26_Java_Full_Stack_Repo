public class Address {
	
	public String doorNo;
	public String streetName;
	public String cityName;
	public String pinCode;

	//non-parameterized constructor
	public Address(){
	   System.out.println("Address  Class ::::: Non-Parameterized Constructor....");
	}

	public void setAddressDetails(String doorNo,String streetName,String cityName,String pinCode){
	    this.doorNo = doorNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pinCode = pinCode;	
	}

	public void displayAddressInfo(){
		System.out.println("*********Address Information********************");
	    System.out.println(doorNo+"====="+streetName+"======"+cityName+"======="+pinCode);
 	}
}