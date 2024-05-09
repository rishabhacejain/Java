package Java_Assignment;

class Triangle{
	double s1,s2,s3;

	public Triangle() {
		s1 = 3;
		s2 = 4;
		s3 = 5;


	}
	public void CalculateArea(){
		double s = (s1+s2+s3)/2; //semi circumference
		double area = Math.sqrt(s*(s-s1)*(s-s2)*(s*s3));
		System.out.println("The Area of the Triangle is "+ area);
	}

	public void CalculatePerimeter() {
		double peri = s1+s2+s3;
		System.out.println("The Perimeter of the Triangle is "+ peri);
	}
}
public class Question27 
{
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.CalculateArea();
		t1.CalculatePerimeter();
		

	}
}



