
public class DemoClient implements Addition, Subtraction {

	@Override
	public void subtract(int a, int b) {
		System.out.println("Subtraction ::::" + (a-b));
	}

	@Override
	public void addition(int a, int b) {
	  System.out.println("Addition ::::" + (a+b));
	}
	
	@Override
	public void display(int a, int b) {
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
}