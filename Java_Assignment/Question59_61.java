package Java_Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Question59_61{
	public static void main(String[] args) {
		
		HashSet<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Orange");
		colors.add("Green");
		colors.add("Pink");
		
		colors.add("Purple"); //q59
		
		
		Iterator<String> itr = colors.iterator(); //q60
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Number Of Elements in the set are "+colors.size()); //q61
		
		//append at the last
		
	    
	    
		

	 }
}




