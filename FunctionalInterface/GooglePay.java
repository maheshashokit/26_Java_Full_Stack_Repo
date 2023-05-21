package FunctionalInterfaces;

public class GooglePay implements Payment {

	@Override
	public void doPayment() {
		System.out.println("This is GooglePay Implementation....");

	}

	@Override
	public void getTransactionDetails() {
		System.out.println("This is GooglePay Transaction Details.....");
	}
}