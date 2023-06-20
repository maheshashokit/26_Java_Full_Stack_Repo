package threads;

public class ReservationUnSafeDemo {
	
	public static void main(String[] args) {
		
		  //creating the object for Reservation with available Berth as 1
		  Reservation r = new Reservation(1);
		  
		  //Attaching the Reservation object to First Passenger Of Mahesh
		  Thread t = new Thread(r);
		  t.setName("Mahesh Passenger");
		  
		  //Attaching the Reservation object for Second Passenger of Suresh
		  Thread t1 = new Thread(r);
		  t1.setName("Suresh Passenger");
		  
		  //Attaching the Reservation object for Second Passenger of Ramesh
		  Thread t2 = new Thread(r);
		  t2.setName("Ramesh Passenger");
		  
		  //start executing the Threads
		  t.start();
		  t1.start();
		  t2.start();
	}
}