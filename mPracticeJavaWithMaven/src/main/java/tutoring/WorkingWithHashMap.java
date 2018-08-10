package tutoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkingWithHashMap {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>(); 
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "Mar");
		hm.put(4, "Apr");
		hm.put(5, "May");
		hm.put(6, "Jun");
		hm.put(7, "Jul");
		hm.put(8, "Aug");
		hm.put(9, "Sep");
		hm.put(10, "Oct");
		hm.put(11, "Nov");
		hm.put(12, "Dec");
		
		System.out.println(hm.get(2));
		
		for(Map.Entry entry: hm.entrySet()) {
			
			System.out.println(entry.getKey()+" \t"+entry.getValue());
		}
		
//		-------------------------
		
		
		
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
