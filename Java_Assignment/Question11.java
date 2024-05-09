package Java_Assignment;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		int newtemp=0;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The value of n");
	int n = sc.nextInt();
	int temp=n ;
	System.out.print(n +" + ");
	for(int i = 1; i<3;i++) {
		
		newtemp = temp*10+n;
		temp = newtemp;
	
	System.out.print(newtemp);
	System.out.print(" + ");
	}
	}
}//did it by hit and trial


