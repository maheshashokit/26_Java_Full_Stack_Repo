class NestedForLoopDemo 
{
	public static void main(String[] args) // Execution Starts From Here
	{
		//outer for loop
		for(int i = 1 ; i<=5 ; i++){  //i=1,i=2,i=3
		
		   System.out.println(i +". Welcome To Ashok IT......");
			
        	//inner for loop
		   for (int j = 1; j<=3 ; j++ ){ //[j=1,j=2,j=3,j=4][j=1j=2,j=3,j=4][j=1j=2,j=3,j=4]

			   System.out.println(j+ ".Java Full Stack Development......");
		   
		   }		
		}
	}
}
