package Java_Assignment;

public class Question13 {
	public static void main(String[] args) {
		int i;
		for( i = 1;i<=100;i++)
		{
			if(i%3==0 && i%5==0) {
				System.out.println("Number "+ i +" is Divisible by both 3 and 5");
			}
		}
	}
}



