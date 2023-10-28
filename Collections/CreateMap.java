package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CreateMap {
	 public static void main(String[] args) {
	        // Creating a HashMap
	     Map<String, Integer> numberMapping = new HashMap<>();

	        // Adding key-value pairs to a HashMap
	        numberMapping.put("One", 1);
	        numberMapping.put("Two", 2);
	        numberMapping.put("Three", 3);

	        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
	        numberMapping.putIfAbsent("Four", 4);

	        System.out.println(numberMapping);
	    
	 
	// Creating a LinkedHashMap
	 LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

	 // Adding new key-value pairs to the LinkedHashMap
	 dayNumberMapping.put("Mon", 1);
	 dayNumberMapping.put("Tus", 2);
	 dayNumberMapping.put("Wen", 3);
	 dayNumberMapping.put("Thu", 4);
	 dayNumberMapping.put("Fri", 5);
	 dayNumberMapping.put("Sat", 6);

	 // Add a new key-value pair only if the key does not exist 
	 // in the LinkedHashMap, or is mapped to `null`
	 dayNumberMapping.putIfAbsent("Sun", 7);

	 System.out.println(dayNumberMapping);
	 
	// Creating a TreeMap
	 TreeMap<String, String> fileExtensions  = new TreeMap<>();

	 // Adding new key-value pairs to a TreeMap
	 fileExtensions.put("python", ".py");
	 fileExtensions.put("c++", ".cpp");
	 fileExtensions.put("kotlin", ".kt");
	 fileExtensions.put("golang", ".go");
	 fileExtensions.put("java", ".java");

	 // Printing the TreeMap (Output will be sorted based on keys)
	 System.out.println(fileExtensions);
	 
	 System.out.println("using for loop");
	for(Map.Entry<String, String> entry : fileExtensions.entrySet()) {
		 System.out.println(entry.getKey()+ ":" + entry.getValue()) ;
		 
		 
	 }
	 LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
     map.put("One", 1);
     map.put("Two", 2);
     map.put("Three", 3);

     // Using Java 8 forEach and lambda expression
     map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

}
}



