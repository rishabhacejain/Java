package Java_Assignment;



public class Question38{
	public static void main(String[] args) {
		
		
		
		 try {
		int a[] = new int[5];
		
		a[5] = 30/0;
		
	    }
		catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: Array index out of bounds.");
			}
	    catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	    
	    
		

	 }
}




