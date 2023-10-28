package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> daysOfTheWeek=new HashSet<>();
		
		daysOfTheWeek.add("monday");
		daysOfTheWeek.add("tuesday");
		daysOfTheWeek.add("wednesday");
		daysOfTheWeek.add("thursday");
		daysOfTheWeek.add(null);
		daysOfTheWeek.add(null);

		
		
		System.out.println("hashset output " + daysOfTheWeek);
		
		Set<String> daysOfTheWeek1=new TreeSet<>();
	
		daysOfTheWeek1.add("monday");
		daysOfTheWeek1.add("tuesday");
		daysOfTheWeek1.add("wednesday");
		daysOfTheWeek1.add("thursday");
		daysOfTheWeek1.add("friday");
		daysOfTheWeek1.add("sarturday");
		daysOfTheWeek1.add("sunday");
		System.out.println("Treeset output "+ daysOfTheWeek1);

		// adding two sets
		daysOfTheWeek.addAll(daysOfTheWeek1);
		System.out.println("after adding two sets "+daysOfTheWeek);
		
		

		
		
		

		
		
		

	}

}
