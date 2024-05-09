package Java_Assignment;

class PrintNumber {

	public void printn(int num) {
		System.out.println("Integer: " + num);
	}

	// Method to print a double
	public void printn(double num) {
		System.out.println("Double: " + num);
	}

	// Method to print a float
	public void printn(float num) {
		System.out.println("Float: " + num);
	}

	// Method to print a long
	public void printn(long num) {
		System.out.println("Long: " + num);
	}

	// Method to print a short
	public void printn(short num) {
		System.out.println("Short: " + num);
	}


	public void printn(byte num) {
		System.out.println("Byte: " + num);
	}


	public void printn(char ch) {
		System.out.println("Char: " + ch);
	}


	public void printn(boolean bool) {
		System.out.println("Boolean: " + bool);
	}




}

public class Question21 {
	public static void main(String[] args) {
		PrintNumber printer = new PrintNumber();
		printer.printn(10);
		printer.printn(3.14);
		printer.printn(3.14f);
		printer.printn(1000000000000L);
		printer.printn((short) 5);
		printer.printn((byte) 2);
		printer.printn('A');
		printer.printn(true);
	}
}



