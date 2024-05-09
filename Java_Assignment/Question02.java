package Java_Assignment;

import java.util.Scanner;

public class Question02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character Alphabet");
		String ch = sc.next();

		char cap = Character.toUpperCase(ch.charAt(0));

		if(ch.length() == 1){
			if(cap >= 'A' && cap <= 'Z') {
				if((cap == 'A')||(cap == 'E')||(cap == 'I')||(cap == 'O')||(cap == 'U')) {

					System.out.println("It is  A Vowel");
				}
				else
				{
					System.out.println("It is  A Consonant");
				}
			}
			else 
			{
				System.out.println("Oops its an error Enter correct character");
			}

		}
		else {
			System.out.println("Oops its an error Enter correct character");
		}
		sc.close();
	}


}


