package Java_Assignment;

import java.util.ArrayList;

public class Question66{
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Red");
		list2.add("Blue");
		list2.add("Green");
		
		boolean isEqual = list1.equals(list2);
		if(isEqual == true) {
			System.out.println("The Following List are same");
			
		}
		else {
			System.out.println("The Following List are not same");
		}
		
		
		
	    
	    
		

	 }
}




