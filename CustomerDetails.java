
 class CustomerDetails {
	
	//Defining the Fields
	 long id;
	 String name;
	 String location;
	 String billNo;
	 double billAmount;
	
	//Defining the method for initializing the values for this Fields
	 void assignValues(long custId,String custName,String custLocation,
			          String custBillNo,double custBillAmt) {
		
		//Initialize the values between Fields and Inputs 
		id = custId;
		name = custName;
		location = custLocation;
		billNo = custBillNo;
		billAmount = custBillAmt;
	}
	
	//Defining the Method for displaying the values from Fields
	 void displayCustomerInformation() {
		System.out.println("Customer ID             :::::::"+ id);
		System.out.println("Customer Name         	:::::::"+ name);
		System.out.println("Customer Location    	:::::::"+ location);
		System.out.println("Customer BillNo      	:::::::"+ billNo);
		System.out.println("Customer BillAmount  	:::::::"+ billAmount);
		System.out.println("Customer Discount%   	:::::::"+ getDiscountValueByBillAmount());
		System.out.println("Customer Discount Amt	:::::::"+ getDiscountAmountForCustomer());
		System.out.println("Customer Final Bill Amt :::::::"+ getFinalBillAmountForCustomer());
	} 
	
	//Defining the Method to get Discount value for customer
	 float getDiscountValueByBillAmount() {		
		float discountPercentage = 0.0f;
		//Define our business conditions
		if(billAmount >= 10000) {
			discountPercentage =  0.10f; //10% of discount
		}else if (billAmount > 5000 && billAmount <10000) {
			discountPercentage = 0.05f; //5% of Discount
		}else if (billAmount <= 5000){
			discountPercentage = 0.02f;
		}
		return discountPercentage;
	}
	
	//Defining the Method for getting Discount Amount for customer
	 double getDiscountAmountForCustomer() {
		
		//We need to get Discount Percentage
		float discountValue = getDiscountValueByBillAmount(); //method calling from another method
		
		double discountAmount = billAmount * discountValue;
		
		return discountAmount;
	}
	
	//Defining the Method for calculating final Bill Amount
	 double getFinalBillAmountForCustomer() {
		
		//BillAmount & Discount Amount
		double discountAmt = getDiscountAmountForCustomer();
		
		double finalAmount =  billAmount - discountAmt;
		
		return finalAmount;
	}
  	
     //Defining the main method to define application logic
	 public static void main(String[] args) {
		
		//Object creation for Customer class
		CustomerDetails maheshCustomer = new CustomerDetails();
		
		//calling the assign values for Initializing the values
		maheshCustomer.assignValues(123, "Mahesh", "Hyderabad","AIT123", 10000);
		
		//calling for displayCustomerInformation() for confirmation about assignments
		maheshCustomer.displayCustomerInformation();
				
		System.out.println("************************************************************");
		
		CustomerDetails rameshCustomer = new CustomerDetails();
		
		//calling the assign values
		rameshCustomer.assignValues(456, "Ramesh", "Mumbai", "AIT567", 5000);
		
		//calling the displayCustomerInformation()
		rameshCustomer.displayCustomerInformation();
		
		System.out.println("************************************************************");
		
		CustomerDetails sureshCustomer = new CustomerDetails();
		
		System.out.println("Customer Id ::::" + sureshCustomer.id);
		System.out.println("Customer Name::::::" + sureshCustomer.name);
		
		sureshCustomer.displayCustomerInformation();
		
	}
}
