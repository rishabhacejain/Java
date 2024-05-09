package Java_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question51_56{
	public static void main(String[] args) {
	
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Orange");
		colors.add("Green");
		colors.add("Pink");
		
		
		colors.add(0, "Purple");  //question 51
		
		colors.set(5, "White");  //question 53
		
		colors.remove(2); //question 54
		
		colors.get("Orange");		
		
		
		//Collections.sort(colors); q56
		
		
		
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("question 52**********************************************");
		System.out.println(colors.get(0)); //question 52
		
	    
	    
		

	 }
}




