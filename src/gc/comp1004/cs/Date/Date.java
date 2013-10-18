package gc.comp1004.cs.Date;

/*
 * Name : Durwin Barcenas
 * Date : Oct. 17, 2013 
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




// Set the day; the value should be valid depending on the month; remember to check if it is a leap year   
public void setDay( int dd )
{ 
  
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

private int convertToDayOfYear()    
{
	 //write the code for this method replacing the return statement by the proper value
	   return 0; //
} // end method convertToDayOfYear

// convert from month name to month number
// called from the constructor that takes in the name of the month as one of its parameter
//set month to 1 if monthName is invalid
private void convertFromMonthName( String monthName )   
{
  //write the code for this method
} // end convertFromMonthName
} // end class Date




