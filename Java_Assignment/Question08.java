package Java_Assignment;

import java.util.Scanner;

public class Question08 {
	public static void main(String[] args) {
		int i;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Interger");
		i = sc.nextInt();
		if(i>0) {
			size = String.valueOf(i).length();
			System.out.println(size);
		}
		else {
			System.out.println("Please Enter a Positive integer");
		}

		
			
		

	}
}


