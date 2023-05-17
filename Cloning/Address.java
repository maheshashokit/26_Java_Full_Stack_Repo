package cloning;

public class Address implements Cloneable{
	
	public String streetName;
	
	public String cityName;

	public Address() {
		System.out.println("Address Class Constructor");
	}
	
	public Address(String streetName, String cityName) {
		this.streetName = streetName;
		this.cityName = cityName;
	}
	
	public void displayAddressDetails() {
		System.out.println("StreetName ::::" + streetName);
		System.out.println("CityName   ::::" + cityName);
	}
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		 Object clonedObject = super.clone();
		 //TypeCast
		 Address address = (Address)clonedObject;
		 return address;
	}
}
