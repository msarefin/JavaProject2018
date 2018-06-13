package QA;

import java.util.Calendar;

public class CalendarClass {

	public static void main (String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int dayofmonth = cal.get(Calendar.DAY_OF_MONTH);
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		int x = cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(dayofmonth);
		System.out.println(dayofweek);
		System.out.println(x);
		
	}
}
