package Java_Assignment;

import java.util.ArrayList;

public class Question75{
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		list1.add("Grey");
		list1.add("Black");
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Red");
		list2.add("Blue");
		list2.add("Green");
		
//		ArrayList<String> list3 = new ArrayList<String>();
//		list2.add("Red");
//		list2.add("Blue");
		
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		
		
	    
	    
		

	 }
}




//empty or not map value