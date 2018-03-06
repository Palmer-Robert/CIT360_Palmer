package javaCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	 public static void main(String args[]) {
		 
		 // Hash Set constructor
		 Set<String> hash_set = new HashSet<String>();
		 
		 // Adding hash set elements
		 hash_set.add("Frodo");
		 hash_set.add("Samwise");
		 hash_set.add("Mary");
		 hash_set.add("Pippin");
		 hash_set.add("Aragorn");
		 hash_set.add("Legolas");
		 hash_set.add("Gimli");
		 hash_set.add("Boromir");
		 hash_set.add("Gandalf");
		 hash_set.add("Gandalf");
		 
		 // Out the original 9 companions that set out from Rivendale. HashSet does not allow duplicates
		 System.out.println("The Fellowship of the Ring is:\n " + hash_set + "\n");
	 }
}
