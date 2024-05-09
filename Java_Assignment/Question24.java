package Java_Assignment;

class ParentClass{
	
	public void printParent() {
		System.out.println("This Is The Parent Class.");
	}
}

class Childclass extends ParentClass{
	 public void printChild() {
		 System.out.println("This Is The Child Class.");
		 
	 }
}


public class Question24 {
	public static void main(String[] args) {

		ParentClass pcObj = new ParentClass();
		Childclass ccObj =new Childclass();
		pcObj.printParent();
		ccObj.printChild();
		ccObj.printParent();
		
	}
}



