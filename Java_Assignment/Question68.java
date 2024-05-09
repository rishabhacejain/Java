package Java_Assignment;

import java.util.ArrayList;
import java.util.List;

public class Question68{
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Pink");
		list2.add("Orange");
		list2.add("Black");
		
//		ArrayList<String> list3 = new ArrayList<String>();
//		list2.add("Pink");
//		list2.add("Blue");
//		list2.add("Black");
		
		List<String> joinedList = new ArrayList<String>(list1);
		joinedList.addAll(list2);
//		joinedList.addAll(list3);
		System.out.println(joinedList);
		
		
	    
	    
		

	 }
}




