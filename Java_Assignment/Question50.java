package Java_Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Question50{
	public static void main(String[] args) {
	
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Orange");
		colors.add("Green");
		colors.add("Pink");
		
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	    
	    
		

	 }
}




