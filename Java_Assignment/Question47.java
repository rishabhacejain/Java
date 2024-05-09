package Java_Assignment;
class TestThreadTwice1 extends Thread{
	public void run(){
		for(int i = 1;i <=5;i++) {
			
		}
		
	}
}


public class Question47{
	public static void main(String[] args) {
		TestThreadTwice1 t1 = new TestThreadTwice1();
		t1.start();
		t1.start();
		
		
		
	    
	    
		

	 }
}




