package mapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		
		// HashMap - hashMap is data structure where the values are stored in key value pair 
		// Map is a interface there in java 
		// hashMap is a class implementing Map(interface)
		// hashMap will never maintain the indexing/ order
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("A", "Tom");
		empMap.put("B", "Peter");
		empMap.put("C", "Robert");
		
		//To fetch the value we have to use the Key
		System.out.println(empMap.get("A"));// Tom
		
		HashMap<String, Integer> studentMap = new HashMap<String, Integer>();
		
		studentMap.put("Tom", 100);
		studentMap.put("Peter", 200);
		studentMap.put("Peter", 300);
		studentMap.put("Robert", 300);// we can have duplicate values 
		studentMap.put(null, 400);// is null key allowed ? --> yes it is allowed but no significance for it
		studentMap.put(null, 500);
		 
		//If there is duplicate key then the latest updated value will be printed
		System.out.println(studentMap.get("Peter"));// latest value 300 is printed 
		System.out.println(studentMap.get(null)); // latest value 500 is printed 
		
		HashMap<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		m1.put(1, 100);
		m1.put(2, 200);
		
		HashMap<Integer, String> userMap = new HashMap<Integer, String>();
		userMap.put(101, "Tom");
		
		// How to traverse hashMap:
		// 1.) using lambda (->)
		
		System.out.println();
		studentMap.forEach((k,v) -> System.out.println(k +":"+v));
		// Null will always be printed at first 
		
		
		
		

		
	}

}
