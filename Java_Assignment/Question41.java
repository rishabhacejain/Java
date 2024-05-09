package Java_Assignment;



class Validate{
	 void validate(int age) {
		 if(age < 18) {
			 throw new ArithmeticException("Not VAlid");
		 }
		 else {
			 System.out.println("Welcome to Vote");
		 }
	 }
	
	
}

public class Question41{
	public static void main(String[] args) {
      Validate valid = new Validate();
		
		try {
			valid.validate(17);
		} catch (ArithmeticException e) {
		
			e.printStackTrace();
		}
		


	 }
}




