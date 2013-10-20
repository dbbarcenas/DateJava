package gc.comp1004.cs.Date;


/*
 * Name : Durwin Barcenas
 * Date : Oct. 18, 2013 
 */
//Exercise 8.14 Solution: Date.java
//Date class definition



public class Date


{
private int day; // day of the month
private int month; // month in the year
private int year; // year
private static final String[] monthNames = { "January", "February", 
   "March", "April", "May", "June", "July", "August", 
   "September", "October", "November", "December" };
private static final int[] monthDays = { 31, 28, 31, 30, 31, 30, 
   31, 31, 30, 31, 30, 31 };
private final int MIN_MONTH=1, MAX_MONTH=12, MIN_YEAR=1900, MAX_YEAR=2100, CURRENT_YEAR=2013;

public Date() {
  setMonth(1);
  setDay(1);
  setYear(CURRENT_YEAR);
}

public Date(int month, int day, int year) {
  setMonth(month);
  setDay(day);
  setYear(year);
}

public Date(String monthNames, int day, int year) {
	convertFromMonthName(monthNames);
  setDay(day);
  setYear(year);
}

public Date(int dayOfYear, int year) {
	convertFromDayOfYear(dayOfYear);
	setYear(year); 
}

// Set the day; the value should be valid depending on the month; remember to check if it is a leap year   
public void setDay( int dd )
{ 
	boolean validDay = false;
	for (int i=0; i < Date.monthDays.length; i++)
		if ( this.month == (i + 1) )
			validDay = (dd <= Date.monthDays[i] && dd > 0) || (this.month == 2 && leapYear() && (dd <= 29 && dd > 0));
	if (validDay)
		this.day = dd;
	else // month is invalid 
	  throw new IllegalArgumentException( "Day must be valid. ");
} // end method setDay

// Set the month
public void setMonth( int mm ) 
{ 
   if ( mm >= MIN_MONTH && mm <= MAX_MONTH ) // validate month
      month = mm;
   else // month is invalid 
      throw new IllegalArgumentException( "Month must be "+MIN_MONTH +"-" +MAX_MONTH );
} // end method setMonth

// Set the year
public void setYear( int yyyy ) 
{ 
   if ( yyyy >= MIN_YEAR && yyyy <= MAX_YEAR ) // validate year
      year = yyyy;
   else // year is invalid 
      throw new IllegalArgumentException( "Year must be "+ MIN_YEAR+ "-" + MAX_YEAR);
} // end method setYear




// Return the number of days in the month
private int daysInMonth() 
{ 
   return leapYear() && month == 2 ? 29 : monthDays[ month - 1 ];
} // end method daysOfMonth

// test for a leap year
private boolean leapYear() 
{
   if ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) )
      return true;
   else
      return false;
} // end method leapYear

// sets the day and month to the proper values based on day of the year
//called from the constructor that takes in the day of the year as one of its parameter
private void convertFromDayOfYear( int ddd ) 
{
   int dayTotal = 0;

   if ( ddd < 1 || ddd > 366 ) // check for invalid day
      ddd = 1;

   setMonth( 1 );

   for ( int m = 1; 
      m < 13 && ( dayTotal + daysInMonth() ) < ddd; ++m )
   {
      dayTotal += daysInMonth();
      setMonth( m + 1 );
   } // end for

   setDay( ddd - dayTotal );
} // end convertFromDayOfYear

// given a month and day converts it into the day of the year
// called from the method that returns the date in the format DDD YYYY

private int convertToDayOfYear(int month,int day)    
{
	int dayOfYear = 0;
	for(int i=0; i < (month - 1);i++)
		dayOfYear += Date.monthDays[i];
	dayOfYear += day;
	
	 //write the code for this method replacing the return statement by the proper value
	   return dayOfYear ; //
} // end method convertToDayOfYear

// convert from month name to month number
// called from the constructor that takes in the name of the month as one of its parameter
//set month to 1 if monthName is invalid
private void convertFromMonthName( String monthName )   
{
	int monthNum = 0;
  for(int i=0; i< Date.monthNames.length; i++){
	 if (Date.monthNames[i] == monthName) {
		 monthNum = i + 1;
	 }
  }
  setMonth(monthNum);
} // end convertFromMonthName

public String getSlashedDate() {
	return this.month + "/" + this.day + "/" + this.year;
}
public String getFullDate() {
	return Date.monthNames[this.month-1] + " " + this.day + ", " + this.year;
}
public String getYearDayDate() {
	int ddd = convertToDayOfYear(month, day);
	return ddd + " " + this.year;
}
} // end class Date



