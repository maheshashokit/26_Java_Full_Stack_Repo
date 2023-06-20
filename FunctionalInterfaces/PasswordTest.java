package FunctionalInterfaces;

@FunctionalInterface
public interface PasswordTest {
	
	//Defining the default methods
	default public void security() {
		System.out.println("Security Implementation By Oracle Corporation.....");
	}
	
	default public void scratchCard() {
		System.out.println("Scratch Card Implementation By Oracle Corporation.....");
	}
	
	//Defining the static methods
	static void display() {
		System.out.println("This is From Payment Interface display method.....");
	}
	
	static void displayMessage(String message) {
		System.out.println("Info Message" + message);
	}
	
	public boolean verifyPassword(String password);

}
