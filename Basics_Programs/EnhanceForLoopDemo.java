class EnhanceForLoopDemo 
{
	public static void main(String[] args) 
	{
		int a = 10; //Normal Variable at time will hold one value.

        //Array Variable holding multiple values for a single variable
		int b[] = {10,20,30,40,50};

		//Accessing the Value from Array based on index
		//Array Index always starts from 0
	    System.out.println("First Value::::" + b[0]); 
		System.out.println("Second Value::::" + b[1]); 
		System.out.println("Third Value::::" + b[2]); 
		System.out.println("Fourth Value::::" + b[3]); 
		System.out.println("Fifth Value ::::"  + b[4]); 
		System.out.println("Sixth Value ::::"  + b[5]);

		//Accessing the values from Array using traditional for loop
		//Traditional for loop is an index based looping
		System.out.println("Traditional For Loop Demo......");
		for(int i = 0 ; i< b.length ; i++){
		   System.out.println("b["+i+"] " + b[i]);
		}
   
        System.out.println("************************************************************");

		//Accessing the values from Array using Enhanced for loop
		//It is not an index based for loop 
		System.out.println("Enhanced For Loop Demo......");
	    for(int temp : b){
			System.out.println("temp:::" + temp); 
		}
 
	}
}
