
public class InterfaceClient {

	public static void main(String[] args) {
		
		OracleDatabaseConnectivity odc = new OracleDatabaseConnectivity();
		
		//calling abstract method implementation
		odc.connectToDatabase();
		odc.display(); //newly added method
		
		System.out.println("Accessing Database Name::::" + DatabaseConnectivity.databaseName);
		
		System.out.println("*****************************************");
		
		MySqlDatabaseConnectivity mdc = new MySqlDatabaseConnectivity();
		mdc.connectToDatabase();
		
		System.out.println("******************************************");
		
		//Creating implementation class object and holding into Interface variable
		DatabaseConnectivity dc = new OracleDatabaseConnectivity();
		dc.connectToDatabase();
		//dc.display(); //we can't give call through dc object because its specific oracle class.
		
		//After oracle task is done we can change the object of dc variable
		dc = new MySqlDatabaseConnectivity();
		dc.connectToDatabase();
	}
}