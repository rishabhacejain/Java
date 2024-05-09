package Java_Assignment;

abstract class Bank{
	abstract public void getBalance();
}
class Bank1 extends Bank{

	@Override
	public void getBalance() {
		System.out.println("You have a Balance of $100 in Bank1");


	}

}
class Bank2 extends Bank{

	@Override
	public void getBalance() {
		System.out.println("You have a Balance of $150 in Bank2");

	}

}
class Bank3 extends Bank{

	@Override
	public void getBalance() {
		System.out.println("You have a Balance of $200 in Bank3");

	}

}

public class Question30 
{
	public static void main(String[] args) {

         Bank b1 = new Bank1();
         Bank b2 = new Bank2();
         Bank b3 = new Bank3();
        
         b1.getBalance();
         b2.getBalance();
         b3.getBalance();
	
	}
}



