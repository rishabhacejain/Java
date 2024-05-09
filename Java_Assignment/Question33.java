package Java_Assignment;

import java.text.DecimalFormat;

abstract class Shapes{
	
	abstract public double RecatanglArea(double l,double b);
	abstract public double SquareArea(double s);
	abstract public double CircleArea(double r);
}

class Area extends Shapes{

	@Override
	public double RecatanglArea(double l, double b) {
		double area = l*b;
		DecimalFormat df = new DecimalFormat("#.##");
		return area;
		
	}

	@Override
	public double SquareArea(double s) {
		double area = s*s;
		DecimalFormat df = new DecimalFormat("#.##");
		return area;
	}

	@Override
	public double CircleArea(double r) {
		double area = 3.14*r*r;
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(area);		
	}
	
	
	
}


public class Question33 
{
	public static void main(String[] args) {
      
		Area shape =new Area();
		
		System.out.println("Area of Rectangle is "+shape.RecatanglArea(25, 36));
		System.out.println("Area of Square is "+shape.SquareArea(52));
		System.out.println("Area of Circle is "+shape.CircleArea(6));
		
		
	}
}



