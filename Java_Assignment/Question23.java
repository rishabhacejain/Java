package Java_Assignment;

class Shape{

	public void Area(float side){
		float area = side * side;
		System.out.println("The Are Of the Square is " + area);

	}
	public void Area(float length, float breadth){
		float area = length * breadth;
		System.out.println("The Are Of the Rectangle is " + area);

	}
}


public class Question23 {
	public static void main(String[] args) {

		Shape s = new Shape();
		s.Area(5);
		s.Area(25, 36);

	}
}



