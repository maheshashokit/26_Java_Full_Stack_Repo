
//This class is used for performing filter operations on various conditions
public class ApplicationFilterDemo {
	
	//Getting Product Details based on Start price & End Price.
	public void getProductDetails(int startPrice,int endPrice) {
		System.out.println("Getting Products Info Based on Price Condition....");
	}
	
	//Getting Product Details based on ratings
	public void getProductDetails(float rating) {
		System.out.println("Getting Products Info Based on Rating Conditions.....");
	}
	
	public int getProductDetails(int rating) {
		System.out.println("Getting Products Info Based on Integer Rating Conditions...");
		return 0;		
	}
	
	public int getProductDetails(short rating) {
		return 0;
	}
	
	public void getProductDetails(String brandName) {
		System.out.println("Getting Products Info Based on Brand Name........");
	}
	
	public void getProductDetails(String modelNo,String brandName) {
		System.out.println("Getting Products Info Based on ModelNO & Brand Name.....");
	}
	
    //We can have static methods
	public static void getProductDetails(int price,String brandName) {
		System.out.println("Getting Products based on price & Brand Name of Static method....");
	}
	
	public static void getProductDetails(int price,float rating) {
		System.out.println("Getting Products based on price & Rating of static method......");
	}
}
