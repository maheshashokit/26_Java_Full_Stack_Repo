
public class MethodOverloadingClient {

	public static void main(String[] args) {
		
		ApplicationFilterDemo afd = new ApplicationFilterDemo();
		
		afd.getProductDetails(4.5f);//calling the Product Details by Rating of float
		
		afd.getProductDetails("SAMSUNG");//calling the product details by brand Name.
		
		afd.getProductDetails(10000, 15000);//calling the product details by price Ranges
		
		//Overloaded static method calling with name of class.
		ApplicationFilterDemo.getProductDetails(150000, 3.5f);
		ApplicationFilterDemo.getProductDetails(25000, "Samsung");
		
		main(new int[] {10,20,30});		
		MethodOverloadingClient.main(new int[] {10,20,30});
	}
	
	//overloading main method
	public static void main(int[] args) {
		System.out.println("Calling the Another Class.........");
	}

}
