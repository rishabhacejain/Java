package Java_Assignment;

class ShapeQ35 {
	
	public void toPrintShape() {
		System.out.println("This Is This Shape");
	}
}

class RectangleQ35 extends ShapeQ35{
	public void toPrintRec() {
		System.out.println("This Is Rectangle");
	}
	
}
class Circle extends ShapeQ35{
	public void toPrintCir() {
		System.out.println("This Is Circle");
	}
}

class SquareQ35 extends RectangleQ35{ 
	
	public void toPrintSq() {
		System.out.println("Square Is a Rectangle");
	}
	
}

public class Question35 
{
	public static void main(String[] args) {
		
		SquareQ35 sq = new SquareQ35();
		sq.toPrintShape();
		sq.toPrintRec();
		

	}
}



