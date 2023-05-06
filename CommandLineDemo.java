
public class CommandLineDemo {

	public static void main(String[] args) {
		
		//Traditional for loop processing command line arguments
		if(args.length > 0) {			
			for(int i = 0 ; i <args.length ; i++) {
			   System.out.println("args["+i+"] " + args[i]);
			}
			
			//we are expecting some number as string format
			int value = Integer.parseInt(args[0]);
			System.out.println("Value ::::" + value);
		}
		
		//Enhanced For loop for Processing Command Line Arguments
		for(String currentElement : args) {
			System.out.println("Current Element:::::"+ currentElement);
		}
   }
}
