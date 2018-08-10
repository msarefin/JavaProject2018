package tutoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkingWithHashMapWithMultipleList {

	public static void main(String[] args) {
		
		
		
		List<String> DayOfweek = new ArrayList<String>();
		DayOfweek.add("Sunday"); 
		DayOfweek.add("Monday");
		DayOfweek.add("Tuesday");
		DayOfweek.add("Wednesday");
		DayOfweek.add("Thursday");
		DayOfweek.add("Friday");
		DayOfweek.add("Saturday");
		
		List<String> MonthOfYear = new ArrayList<String>();
		MonthOfYear.add("Jan");
		MonthOfYear.add("Feb");
		MonthOfYear.add("Mar");
		MonthOfYear.add("Apr");
		MonthOfYear.add("May");
		MonthOfYear.add("Jun");
		MonthOfYear.add("Jul");
		MonthOfYear.add("Aug");
		MonthOfYear.add("Sep");
		MonthOfYear.add("Oct");
		MonthOfYear.add("Nov");
		MonthOfYear.add("Dec");
		

		Map<String, List<String>> myMap = new HashMap<String, List<String>>();
		
		myMap.put("Days Of Week",DayOfweek); 
		myMap.put("Months of Year", MonthOfYear); 
		
		for(Map.Entry Month_day: myMap.entrySet()){
		    System.out.println(Month_day.getKey()+"\t"+Month_day.getValue());
		}
		
		
		}
	
}
