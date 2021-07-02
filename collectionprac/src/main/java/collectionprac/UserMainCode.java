package collectionprac;

import java.util.Calendar;

public class UserMainCode {
	
	public static int getNumberOfDays(int month, int year) {
		Calendar cal = Calendar.getInstance();
		
		//correct math for entered month
		month = month -1;
	
		//setting year and month
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);		
		
		int day = cal.getActualMaximum(cal.DAY_OF_MONTH);
				
		return day;			

	}
	
	//getting day variable from findDays class
	//return afterwards
	//not working WIP
	/*
	public static int getNumDays() {
		findDays newDay = new findDays();
	}*/

}
