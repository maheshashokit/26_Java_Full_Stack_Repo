package FunctionalInterfaces;
public class Customer{

	public String customerId;
	public String cityName;
	public double billAmount;
	
	//Non-Parameterized Constructor
	public Customer() {
		System.out.println("Customer Class ::::: Non-Parameterized Constructor....");
	}
	

	public Customer(String customerId, String cityName, double billAmount) {
		super();
		this.customerId = customerId;
		this.cityName = cityName;
		this.billAmount = billAmount;
	}
	//Java method for setting values to customer object
	public void setCustomerDetails(String customerId, String cityName, double billAmount) {
		this.customerId = customerId;
		this.cityName = cityName;
		this.billAmount = billAmount;
	}

	//Java Method for displaying customer Information
	public void displayCustomerDetailsInfo() {
		System.out.println("*********Customer Information********************");
		System.out.println("CustomerID ::" + customerId + " City Name ::" + cityName + " BillAmount ::" + billAmount);
	}
}