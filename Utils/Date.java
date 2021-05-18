import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
	public static int GetDateYearInt(Calendar date) {
		  date = new GregorianCalendar(1974, 12, 2);
		  int year = date.get(Calendar.YEAR);  
		  return year;
			/*
			 * int month = date.get(Calendar.MONTH);
 	           int day =date.get(Calendar.DAY_OF_MONTH);
			 */
		  }
	
}
