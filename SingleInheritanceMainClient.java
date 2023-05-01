//For testing single level inheritance
public class SingleInheritanceMainClient {

	public static void main(String[] args) {
		
		//Create object for BasicWatch class i.e.,Child Class(Specialized class)
		BasicWatch bw = new BasicWatch();
		
		//setting time for watch
		bw.setTimeForWatch(8, 50, 37); //From Watch Class
		
		//Setting date for Watch
		bw.setDateForWatch(31, "MAR", 2023);
		
		//display for time value
		bw.displayTimeInfo();
		
		//display for date value
		bw.displayDateInfo();
		
		//compile error
		//BasicWatch bw3 = new Watch();
			
		//upcasting from lower to higher
		Watch w2 = new BasicWatch();
		
		//downcasting from higher to lower		
		BasicWatch bw2 = (BasicWatch)w2;
		
		bw2.setDateForWatch(10, "DEC", 2023);
		bw2.setTimeForWatch(12, 25, 60);
		bw2.displayDateInfo();
		bw2.displayTimeInfo();
	}
}