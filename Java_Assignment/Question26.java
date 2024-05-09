package Java_Assignment;

class Rectangle{
	
	int length;
	int breadth;
	
	public void area() {
		int area = length*breadth;
		System.out.println(area);
	}
	public void peri() {
		int peri = 2*(length+breadth);
		System.out.println(peri);
	}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}

class Square extends Rectangle{

	public Square(int side) {
		super(side, side);
		
	}
	
}
public class Question26 
{
	public static void main(String[] args) 
	{
		Rectangle rc = new Rectangle(5, 5);
		Square sq = new Square(30);
	    rc.area();	
		rc.peri();
		sq.area();
		sq.peri();
		
	}
}



