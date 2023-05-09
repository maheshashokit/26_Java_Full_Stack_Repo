//This is First implementation class for DatabaseConnectivity interface
public class OracleDatabaseConnectivity implements DatabaseConnectivity{
	
	@Override
	public void connectToDatabase() {
		System.out.println("This is Implementation Classs for OracleDatabase Connectivity....");
	}
	
	public void display() {
		System.out.println("This is from Oracle Class Display Method.....");
	}
}