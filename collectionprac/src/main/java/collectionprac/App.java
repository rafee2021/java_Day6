package collectionprac;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EX1_2_3_4 colors = new EX1_2_3_4();
		
		colors.colors("orange");
		
		EX5.myTree();
	
		
		
		//gets date and time
		timeDate cal = new timeDate();
		cal.date();
		
		//gets number of days in a month
		//user input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter The Month as an Integer: ");
		int month = scan.nextInt();
		
		System.out.println("Please Enter The Year: ");
		int year = scan.nextInt();
		
		//find max number of days
		findDays day = new findDays();
		day.findDays(month, year);
		
		UserMainCode.getNumberOfDays(month, year);
			

	}

}
