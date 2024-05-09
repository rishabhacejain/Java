package Java_Assignment;

abstract class Parent{
	abstract public void message();
}
class FirstSubclass extends Parent{

	@Override
	public void message() {
		System.out.println("This is The First Subclass");


	}

}
class SecondSubclass extends Parent{

	@Override
	public void message() {
		System.out.println("This is The Second Subclass");

	}

}

public class Question29 
{
	public static void main(String[] args) {

         FirstSubclass f1 = new FirstSubclass();
         SecondSubclass s1 = new SecondSubclass();
         
         f1.message();
         s1.message();
	
	}
}



