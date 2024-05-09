package Java_Assignment;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Question73{
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Grey");
		colors.add("Black");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Color Name");
		String newItem = sc.next();
		
		if(colors.size() >=2) {
			colors.set(1, newItem);
			System.out.println("Updated List "+colors);
		}
		else {
			System.out.println("List Doesn't have sufficient elements");
		}
		
		
	    
	    
		

	 }
}




