package Java_Assignment;

public class Question07 {
	public static void main(String[] args) {

		int lines = 4;
		int number = 1;
	
		for (int i = 1; i <=lines; i++) {
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(number +" " );
				number++;
			}
			System.out.println();
			
			
		}

	}
}


