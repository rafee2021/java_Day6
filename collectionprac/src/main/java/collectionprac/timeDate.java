package collectionprac;

import java.util.Calendar;

public class timeDate {
	
	public static void date() {
		Calendar cal = Calendar.getInstance();
		 
		//prints out the full date
		System.out.println("Today's date is: " + (cal.get(Calendar.MONTH) + 1)
			+ "/" + cal.get(Calendar.DATE) + "/" + cal.get(Calendar.YEAR));
		
		//prints current time
		System.out.println("The current time & date are: " + cal.getTime());
	}
}
