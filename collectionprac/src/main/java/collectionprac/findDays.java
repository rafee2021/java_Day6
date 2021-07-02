package collectionprac;

import java.util.Calendar;

public class findDays {

	public static void findDays(int month, int year) {
		Calendar cal = Calendar.getInstance();
		
		//correct math for entered month
		month = month -1;
	
		//setting year and month
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.YEAR, year);
		
		if(month < 13 && month >= 0) {					
			int day = cal.getActualMaximum(cal.DAY_OF_MONTH);
			System.out.println("Max number of days in this month and year: " + day);			
		
		} else {
			System.out.println("Please enter a valid month and year");
		}
	}
}
