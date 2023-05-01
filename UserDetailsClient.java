import java.util.Scanner;

public class UserDetailsClient {

	public static void main(String[] args) {
		
		//creating the object for Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next(); //nextInt(),nextDouble(),nextBoolean() etc.,
		System.out.println("Enter Password");
		String password =sc.next();
		
		UserDetails ud = new UserDetails();
		//Calling mutator method for setting the values
		ud.setUsername(username);
		ud.setPassword(password);
		//calling the Accessor method for getting the values
		System.out.println("Username :::::" + ud.getUsername());
		System.out.println("Password :::::" + ud.getPassword());
		
		sc.close();
	}
}
