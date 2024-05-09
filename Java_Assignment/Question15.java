package Java_Assignment;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		String str1 ="Hi, ";
		String str2 = ". How Are You?";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name");
		String name = sc.next();		
		String finalStr = str1 + name + str2;
		System.out.println(finalStr);
	}
}



