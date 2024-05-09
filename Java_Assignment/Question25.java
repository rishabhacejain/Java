package Java_Assignment;

class Member
{
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	public Member(String name,int age,String phoneNumber,String address,double salary) 
	{
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;

	}

	public void printSalary()
	{
		System.out.println("Salary: " + salary);

	}
	
//	public void printName()
//	{
//		System.out.print(" :-" + name);
//
//	}

}
public class Question25 
{
	public static void main(String[] args) 
	{
		Member m1 =new Member("Rishabh", 25, "7990926078", "C-702 AK", 16000);
		//m1.printName();
		m1.printSalary();
		
		Member m2 = new Member("Komal", 21, "901675168", "205-AP", 21000);
	    //m2.printName();
		m2.printSalary();
		
	}
}



