package Java_Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question36 
{
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int result = 0;

		        try {
		            System.out.println("Enter two integers to divide:");
		            int num1 = scanner.nextInt();
		            int num2 = scanner.nextInt();

		            
		            result = num1 / num2;
		            System.out.println("Result of division: " + result);
		        } catch (InputMismatchException e) {
		            System.out.println("Please enter valid integers.");
		        } catch (ArithmeticException e) {
		            System.out.println("Cannot divide by zero.");
		        } finally {
		            
		            scanner.close();
		        }
		    }
		


	}

//with float query


