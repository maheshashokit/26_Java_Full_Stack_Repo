class SwitchDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Starting :::: Switch Demo.......");

		//Displaying the Menu items for User to Select particular option from list of options
		System.out.println(); //displaying empty line
		System.out.println("***************************");
		System.out.println("1. With Draw Operation");
		System.out.println("2. Quick Transfer");
		System.out.println("3. Mini Statement");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. Change Password");
        System.out.println("***************************");

		//Defining the option selected for user as fixed
		int userChoice = 3;

		//writing the switch statement
		switch(userChoice){

			 case 1 : System.out.println("You select First Option as withDraw operation....");
			 		  System.out.println("You select First Option as withDraw operation....");
					  break;

			 case 2 : System.out.println("You select Second Option as Quick Transfer operation....");
			 		  System.out.println("You select Second Option as withDraw operation....");
					  break;

			 case 3 : System.out.println("You select Third Option as Mini Statement operation....");
					  System.out.println("You select Third Option as withDraw operation....");
					  break;

			 case 4 : System.out.println("You select Fourth Option as Balance Enquiry operation....");
					  System.out.println("You select Fourth Option as withDraw operation....");
					  break;

			 case 5 : System.out.println("You select Fifth Option as Change Password operation....");
                      System.out.println("You select Fifth Option as withDraw operation....");
					  break;

			 default : System.out.println("You Selected as wrong option.....");	
			           System.out.println("You Selected as wrong option.....");
					   break;
		
		}
		System.out.println();
		System.out.println("Ending :::: Switch Demo.......");
	}
}