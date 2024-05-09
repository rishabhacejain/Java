package Java_Assignment;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		sc.close();

        int greatest =num1;
		if(num2 > greatest ) 
		{
			greatest = num2;
		
		}
		if (num3 > greatest) {
			greatest = num3;
		}
		
		System.out.println(greatest + " is the greatest number among the entered values");
	}
	
}




