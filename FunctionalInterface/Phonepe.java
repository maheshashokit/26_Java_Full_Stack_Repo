package FunctionalInterfaces;

public class Phonepe implements Payment {

	@Override
	public void doPayment() {
		System.out.println("This is PhonePe Implementation....");

	}

	@Override
	public void getTransactionDetails() {
		System.out.println("This is PhonePe Transaction Details.....");
	}
}