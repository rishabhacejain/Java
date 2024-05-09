package Java_Assignment;

import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year to find Wheter it is Leap year or not");
		int y = sc.nextInt();
		int size =  String.valueOf(y).length();
		if(size == 4) {
			if(y%400==0||y%100 !=0 && y%4==0)  {
				System.out.println("The Entered Year Is a Leap Year");

			}
			else {
				System.out.println("The Year Is Not A Leap Year");
			}
		}
		else {
			System.out.println("Please Enter a Valid Year");
		}
		sc.close();
	}


}


