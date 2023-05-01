
public class User {

	private String username;

	private String password;

	// Defining the Non-Parameterized Constructor
	public User() {
		System.out.println("User Class Non-Parameterized Constructor......");
		username = "AshokIT";
        password = "AshokIT";
	}

	// Defining the Parameterized Constructor
	public User(String uname, String upwd) {
		System.out.println("User Class Parameterized Constructor......");
		username = uname;
		password = upwd;
	}

	// Defining the method for displaying the user information
	public void displayUserDetails() {
		System.out.println("Username  ::::::" + username);
		System.out.println("Password  ::::::" + password);
	}

	public static void main(String[] args) {

		// Creating the Object for user Class
		User firstUser = new User(); // Executing Non-Parameterized Constructor
		firstUser.displayUserDetails();

		System.out.println("******************************************************************");

		// Creating the object for User class with Parameters
		User secondUser = new User("Mahesh", "AshokIT");// Executing Parameterized constructor
		secondUser.displayUserDetails();

	}
}