package cop2805C;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Collect {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>(); //get arraylist
       
				cities.add("Melbourne");
                cities.add("Orlando");
				cities.add("Miami"); 
                cities.add("Tampa");
				cities.add("Naples"); 
                cities.add("Lakeland");
                System.out.println("Original List:");
				for ( String ct : cities )
		    System.out.println(ct);
            Collections.shuffle(cities); // randomizing the list
            System.out.println( "Randomized List: " + cities );  // print the randomized list
            Collections.sort(cities); //alphabetizing the list
            System.out.println( "Alphabetized List: " + cities ); // print the alphabatized list
            System.out.println("Index Found In: " + cities.indexOf("Miami")); // print where city index is found
            System.out.println("Index Found In: " + cities.indexOf("Jacksonville")); //search city that's not in list
            System.out.println("Array: ");
            String ct [] = cities.toArray(new String[cities.size()]); //converting original list to array using toArray() method
            for (String str : ct) { //iterate string array
            System.out.println(str); //print string array
            List<String> c = new ArrayList<String>(Arrays.asList(ct)); //convert array to array list 
           System.out.println("List: " + c);    //print array list                                                  
                 }  
   
    }
/* Collection is the interface for classifying objects 
   into one entity. Collections is a utility class that 
   implements tasks on Collection. An interface is a sort
   of reference and it is a collection of abstracted 
   operations. A class utilizes an interface and 
   acquires the interface's abstract methods. 
   Sources: upgrad.com , www.tutorialspoint.com */
    }



   
    
	


