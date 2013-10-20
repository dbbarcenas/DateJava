package gc.comp1004.cs.Date;

import java.util.logging.Logger;

public class TesterDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date aa = new Date("December", 20, 2013); 
		System.out.println(aa.getSlashedDate());
		System.out.println(aa.getFullDate());
		System.out.println(aa.getYearDayDate());
	}

}
