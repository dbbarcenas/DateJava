package gc.comp1004.cs.Date;

/*
 * Name : Durwin Barcenas
 * Date : Oct. 19, 2013 
 */

public class TesterDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Testing Constructor  Date(dayOfYear, year)
		//Testing the leap year 
		Date d1 = new Date(20, 2013); 
		System.out.println("Not Leap year");
		System.out.println(d1.getSlashedDate());
		System.out.println(d1.getFullDate());
		System.out.println(d1.getYearDayDate());
		System.out.println();
		d1 = new Date(20, 2012); 
		System.out.println("Leap year");
		System.out.println(d1.getSlashedDate());
		System.out.println(d1.getFullDate());
		System.out.println(d1.getYearDayDate());
		System.out.println();
		
		//Testing the Constructor Date(nameMonths, day, year)
		Date d2 = new Date("February", 20, 2013); 
		System.out.println(d2.getSlashedDate());
		System.out.println(d2.getFullDate());
		System.out.println(d2.getYearDayDate());
		System.out.println();
		
		//Testing the Constructor Date(month, day, year)
		Date d3 = new Date(10, 21, 2013);
		System.out.println(d3.getSlashedDate());
		System.out.println(d3.getFullDate());
		System.out.println(d3.getYearDayDate());
		System.out.println();
		
		//Testing setDay(int dd) method
		//valid test
		int dayNum = 2; 
		d3.setDay(dayNum); 
		System.out.println(dayNum); 
		System.out.println();
		
		//Testing convertFromMonthName(String name) method 
		//valid test 
		Date d4 = new Date("October",20,2013); 
		System.out.println(d4.getSlashedDate());
		System.out.println();
		
	}

}
