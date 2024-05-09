package Java_Assignment;
class AgeNotWithinRangeException extends Exception{

	public AgeNotWithinRangeException(String message) {
		
	}

}
class NameNotValidException extends Exception{
    
	public NameNotValidException(String message) {
		
	}
}
class Student{
	int roll_no;
	String name;
	int age;
	String course;

	public Student(int roll_no,String name,int age,String course)throws AgeNotWithinRangeException, NameNotValidException {
            
		if (age<15 || age> 21) {
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");

		}
		if(!name.matches("[a-zA-Z ]+")) {
			throw new  NameNotValidException("Name should contain only alphabets and spaces");
		}
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;
	
	}
	 public void displayDetails() {
	        System.out.println("Roll No: " + roll_no);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Course: " + course);
	    }
	
}


public class Question43{
	public static void main(String[] args) {
		try {
		Student st1 = new Student(1, "Rishabh", 25, "Computer");
		st1.displayDetails();
		}catch(AgeNotWithinRangeException e) {
			System.out.println("Error "+ e.getMessage());
			
		}catch(NameNotValidException e) {
			System.out.println("Error "+ e.getMessage());
		}

	}
}




