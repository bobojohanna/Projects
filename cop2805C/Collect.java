package cop2805C;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collect {

   public static void main(String[] args) {

		// Instatiating ArrayList object
		ArrayList<String> cities = new ArrayList<String>(); // get arraylist

		// Adding cities to ArrayList object
		cities.add("Melbourne");
		cities.add("Orlando");
		cities.add("Miami");
		cities.add("Tampa");
		cities.add("Naples");
		cities.add("Lakeland");

		// Printing header message
		System.out.println("Original List:");

		// Iterating over the ArrayList object
		for (String ct : cities)
			System.out.println(ct);

		// Randomizing the list
		Collections.shuffle(cities);
		// Print the randomized list
		System.out.println("Randomized List: " + cities);
		// Alphabetizing the list
		Collections.sort(cities);
		// Print the alphabatized list
		System.out.println("Alphabetized List: " + cities);
		// Print where city index is found
		System.out.println("Index Found In: " + cities.indexOf("Miami"));
		// Search city that's not in list
		System.out.println("Index Found In: " + cities.indexOf("Jacksonville"));
		System.out.println("Array: ");

		// Arraylist to array conversion
		String ctt[] = new String[cities.size()];
		for (int j = 0; j < cities.size(); j++) {
			ctt[j] = cities.get(j);
		}
		// Displaying array 
		for (String k : cities) {
			// Print string array
			System.out.println(k);
            
		}
		// Convert array to array list
		List<String> c = new ArrayList<String>(Arrays.asList(ctt));

		// Print array list
		System.out.println("List: " + c); // print array list
	}

	/*
	 * Collection is the interface for classifying objects into one entity.
	 * Collections is a utility class that implements tasks on Collection. An
	 * interface is a sort of reference and it is a collection of abstracted
	 * operations. A class utilizes an interface and acquires the interface's
	 * abstract methods. Sources: upgrad.com , tutorialspoint.com
	 */
}



   
    
	


