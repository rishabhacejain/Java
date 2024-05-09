package Java_Assignment;

import java.util.Scanner;

public class Question37{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	    int result = 0;
	   
	    	result = num1/num2;
	    	System.out.println("Result is "+ result);
	    }
	    catch (ArithmeticException e) {
			System.out.println("Exception in thread main java.lang.ArithmeticException "+ e.getMessage());
		}
//	    catch (InputMismatchException e) {
//			System.out.println("Error, Enter Valid Numbers ");
//		}
	    finally {
	    	sc.close();
	    }
		

	 }
}
//Exception in thread main java.lang.ArithmeticException



