package Java_Assignment;

class Th1 implements Runnable{
	public void run() {
		for(int i = 1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
		}
		
	}
}

public class Question44{
	public static void main(String[] args) {
		
		
		Th1 t1 = new Th1();
		t1.run();
		Thread Th = new Thread(t1);
		Th.start();
		
	    
	    
		

	 }
}




