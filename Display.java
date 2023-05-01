
public class Display {
	
	//declared the final field
	public final float DISCOUNT_PRICE = 0.10f;
	
	
	//declared the final Method
	public void display() {
		
		System.out.println("Display Class Final Method of display....");
	}
	
	
	public void changeDiscount() {
		
		//DISCOUNT_PRICE = this.DISCOUNT_PRICE + 0.15f;
		System.out.println("DISCOUNT_PRICE===" + DISCOUNT_PRICE);
	}

}
