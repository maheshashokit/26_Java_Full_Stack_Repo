package threads;

public class Reservation extends Thread{
	
	//available berths in train is 1
	public static int availableBerths = 1;
	
	public static int wantedBerths;
	
	//Defining the Constructor
	public Reservation(int wantedBerths) {
		this.wantedBerths = wantedBerths;
	}
	
	//overriding the run
	public void run() {
		/*//object level locking
		synchronized(Reservation.class) {
			System.out.println("Available Berths In Train:::::" + availableBerths);
			if (availableBerths >= wantedBerths) {
				// build the logic to allocate berth for passenger

				// Wanted to Know about the Passenger name to get the ticket
				String passengerName = Thread.currentThread().getName();

				// Allocating the berth to passenger
				System.out.println(wantedBerths + " Berth Reserverd For Following  Passenger:::::" + passengerName);

				// For Printing the Ticket will be holding some of amount of time
				try {
					Thread.sleep(1500);
					availableBerths = availableBerths - wantedBerths;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("Sorry,No Berths are available for your requirement.......");
			}
		}*/		
		bookingTicket();
	}
	
	//class level locking
	public static synchronized void bookingTicket() {
		System.out.println("Available Berths In Train:::::" + availableBerths);
		if (availableBerths >= wantedBerths) {
			// build the logic to allocate berth for passenger

			// Wanted to Know about the Passenger name to get the ticket
			String passengerName = Thread.currentThread().getName();

			// Allocating the berth to passenger
			System.out.println(wantedBerths + " Berth Reserverd For Following  Passenger:::::" + passengerName);

			// For Printing the Ticket will be holding some of amount of time
			try {
				Thread.sleep(1500);
				availableBerths = availableBerths - wantedBerths;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Sorry,No Berths are available for your requirement.......");
		}
	}
}
