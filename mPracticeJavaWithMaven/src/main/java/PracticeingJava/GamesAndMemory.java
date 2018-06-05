package PracticeingJava;

import java.util.EnumSet;

public enum GamesAndMemory {

	John("New York","25"),
	Dave("Montana","30"),
	Janace("California","15"),
	Keith("Nevada","50");
	
	private final String sta; 
	private final String ag;
	
	GamesAndMemory(String state, String age){
		sta = state;
		ag = age;
		
	}
	
	public String getState() {
		return sta;
	}
	
	public String getage() {
		return ag;
	}
	
	public static void main(String [] args) {
		for(GamesAndMemory info:GamesAndMemory.values())
			
			System.out.printf("%s\t\t%s\t\t%s\n", info, info.getState(), info.getage());

	
		System.out.println("----------------------Enum range-----------------");
		for(GamesAndMemory people: EnumSet.range(GamesAndMemory.Dave, GamesAndMemory.Keith))
		
		System.out.printf("%s\t\t%s\t\t%s\n", people, people.getState(), people.getage());

		
	}
}

