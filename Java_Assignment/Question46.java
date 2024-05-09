package Java_Assignment;

class Th11 extends Thread {

	public void run() {
		try {
			sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("Th1 : " + i);
		}

	}
}

class Th2 extends Thread {

	public void run() {
		try {
			sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("Th2 : " + i);
		}
	}
}

public class Question46 {
	public static void main(String[] args) {

		{

			Th11 t1 = new Th11();
			Th2 t2 = new Th2();
			t1.start();
			t2.start();

		}
	}

}
