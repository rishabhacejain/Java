package Java_Assignment;

import java.text.DecimalFormat;

abstract class Marks{
	abstract public void getPercentage();
}
class A extends Marks{
	 double sub1; double sub2; double sub3;
	@Override
	public void getPercentage() {
		double percentage =((sub1 + sub2 + sub3) / 3.0);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Your percentage is " + (df.format(percentage))+"%");
		
	}
	
	public A(double sub1, double sub2, double sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
}

class B extends Marks{
	 double sub1; double sub2; double sub3;double sub4;
public B(double sub1, double sub2, double sub3, double sub4) {
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	this.sub4 = sub4;
	}

	@Override
	public void getPercentage() {
		double percentage =((sub1 + sub2 + sub3+ sub4) / 4.0);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Your percentage is " + (df.format(percentage))+"%");
	}


	
	}






public class Question31 
{
	public static void main(String[] args) {

         A StudentA = new A(78,99,85);
         B StudentB = new B(45,56,71,60);
         
         StudentA.getPercentage();
         StudentB.getPercentage();
	
	}
}



