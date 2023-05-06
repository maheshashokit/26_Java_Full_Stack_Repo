class IfElseIFDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Starting :::: If-else-if Demo.......");

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
		int userChoice = 14;

		//writing the if-elseif statements
		if(userChoice == 1){
		   System.out.println("Block-1 :::::::::: With Draw Operation");
		}else if(userChoice == 2){
		   System.out.println("Block-2 :::::::::: Quick Transfer operation");
		}else if(userChoice == 3){
		   System.out.println("Block-3 :::::::::: Mini Statement Operation");
		}else if(userChoice == 4){
		   System.out.println("Block-4 :::::::::: Balance Enquiry Operation");
		}else if(userChoice == 5){
		   System.out.println("Block-5 :::::::::: Change Password Operation");
		}else{
		   System.out.println("Sorry For Inconvience You selecte with Wrong Option.....");
		}
		System.out.println();
		System.out.println("Ending :::: If-else-if Demo.......");
	}
}
