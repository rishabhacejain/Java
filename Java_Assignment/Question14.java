package Java_Assignment;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		String str = new String("Tops Technologies!");
		char[] charIndex = str.toCharArray();
		System.out.print("Enter Position"); 
		Scanner sc = new Scanner(System.in); 
		try {
			int pos = sc.nextInt();    //Taking Position Input from User
			if(pos<charIndex.length && pos>=0){  
				System.out.println(charIndex[pos]);
			}
			else {
				System.out.println("Invalid position entered");
			}
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Please enter a valid integer for position.");
		}
		finally {
			sc.close();
		}

	}
}



