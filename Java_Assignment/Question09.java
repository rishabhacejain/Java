package Java_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
        String str = sc.nextLine();
		
		char[] ch = str.toCharArray();		
		Arrays.sort(ch);
		
		char currentChar = ch[0];
		int count = 1;
		
		for (int i = 1; i < ch.length; i++) {
            
            if (ch[i] == currentChar) {
                count++;
            } else {
               
                System.out.println(currentChar + ": " + count);
                currentChar = ch[i];
                count = 1;
            }
        }
		
		System.out.println(currentChar + ": " + count);
		

	}
}


