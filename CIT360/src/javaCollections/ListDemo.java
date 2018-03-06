package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

public class ListDemo {	
	
	public static void main (String args[]) {
        // ArrayList constructor.
        ArrayList<String> strings = new ArrayList<String>();
        
        // Add elements to list via boolean add() method.
        strings.add("D");
        strings.add("B");
        strings.add("A");
        strings.add("E");
        strings.add("C");
        strings.add("F");
        strings.add("J");
        strings.add("I");
        strings.add("H");
        strings.add("G");

        // Display the size and contents of the list.
        System.out.println("================Collections.sort()====================\n");
        System.out.println("Before Collections.sort(): \n" + strings);
        
        // Add sort() usage here.
        // Print in ascending order using Collections.sort() method
        Collections.sort(strings);
        System.out.println("\nAfter Collections.sort(): \n" + strings);
        System.out.println("\n======================================================");
        
        // Modify current list elements via Object set(int index, Object element) method.
        strings.set(9, "Jaguar");
        strings.set(8, "Ibis");
        strings.set(7, "Horse");
        strings.set(2, "Cougar");
        strings.set(3, "Dingo");
        strings.set(0, "Alligator");
        strings.set(5, "Fox");
        strings.set(4, "Elephant");
        strings.set(6, "Gorilla");
        strings.set(1, "Bengal");
        
        
        // Display contents of the list.
        System.out.println("\n\n===================================Set() method=========================================\n");
        System.out.println("\nThe Set() method displays the list in ascending order automatically:\n\n" + strings);
        System.out.println("\n=======================================================================================");
        
        
        
        // More documentation and ArrayList methods can be found at: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
    }
}
