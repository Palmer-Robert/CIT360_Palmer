package javaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map map1 = new HashMap();
		map1.put("Robert", "39");
		map1.put("Nancy", "30");
		map1.put("Addison", "6");
		map1.put("Davin", "5");
		map1.put("Janey", "1");
		
		System.out.println(map1);
		
		// Remove an element from the map
		map1.remove("Robert");
		System.out.println(map1);
		
		
		// Use the containsKey() method to search for the correct key element
		System.out.println("Contains Davin? " + map1.containsKey("Davin"));
		System.out.println("Contains Robert? " + map1.containsKey("Robert"));
		// Use get() method to get the value 
		System.out.print("Davin's age: " + map1.get("Davin"));
		
		System.out.println("Iterating using keySet!");
		Set<String> names = map1.keySet();
		for(String name : names) {
			System.out.println("Name: " + name + ", Age: " + map1.get(name));
		}
		
		// Makiing a new TreeMap implementation
		Map map2 = new TreeMap();
		// Add new elements 
		map2.putAll(map1);
		map2.put("George", "12");
		map2.put("Georgia", "12");
		map2.put("Sara", "18");
		
		System.out.println("\n Map 1 put into map 2: \n\n" + map2);
		
		System.out.println("\n\n======Tree=Map===========\n");
		System.out.println("Iterating using keySet in the TreeMap!");
		Set<String> names2 = map2.keySet();
		for(String name : names2) {
			System.out.println("Name: " + name + ", Age: " + map2.get(name));
		}
		System.out.println("\n==========================\n");
		
	}

}
