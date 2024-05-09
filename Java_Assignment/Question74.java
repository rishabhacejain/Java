package Java_Assignment;

import java.util.ArrayList;

public class Question74{
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Grey");
		colors.add("Black");
		
		
		for(int i = 0; i<=colors.size()-1;i++) {
			System.out.println("Postion "+ i +" color name "+ colors.get(i));
		
		}

	 }
}




