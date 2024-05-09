package Java_Assignment;

	class PrintCl{
		
		public void printMtd(int n, char c)
		{
			System.out.println(n + " " + c);
		}
		public void printMtd(char c, int n)
		{
			System.out.println(c + " " + n);
		}
	}

public class Question22 {
	public static void main(String[] args) {
		PrintCl p = new PrintCl();
		
		p.printMtd(12,'p');;
		
		
	}
}

/doubt how can i avoid the error if someone enters number instaed of character;

