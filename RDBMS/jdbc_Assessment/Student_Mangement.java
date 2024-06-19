package jdbc_Assessment;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student_Mangement {
	
	static ArrayList<Student> stud = new ArrayList<Student>();
	public static void main(String[] args) {
		
        
        mainMenu();
		
	}
	public static String mainMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int choice;
			
			System.out.println("Press 1 for Counsellor");
	        System.out.println("Press 2 for Faculty");
	        System.out.println("Press 3 for Student");
	        System.out.println();
	        System.out.println("Enter a role id:");
			
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
               getMenu();
                break;
            case 2:
            	facultyMenu();
                break;
            case 3:
                studentMenu();
                break;
            
            case 0:
                System.out.println("Exiting program...");
                sc.close(); // Close scanner before exiting
                System.exit(0);
            
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
            }
		}
	}
	
	   private static void studentMenu() {
		System.out.println("Under Construction");
		
	}
	public static String getMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int choice;
			System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View all Student");
            System.out.println("4. View Specific Students");
            System.out.println("0. Previous Menu");
            System.out.println();
            System.out.println("Enter a Counsellor's Choice");
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                addStudent(stud);
                break;
            case 2:
            	removeStudent();
                break;
            case 3:
                viewAllStudents();
                break;
            case 4:
            	viewSpecificStudent();
                break;
            case 0:
                System.out.println("Going to Main Menu program...");
                
                mainMenu();
            
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                sc.close();
            }
		}
	   }
	public static String facultyMenu() {
		while (true) {
	        int choice;
	        System.out.println("Welcome");
	        System.out.println("1. Add Marks for Students");
	        System.out.println("2. View My Students");
	        System.out.println("0. Back to Main Menu");
	        Scanner sc = new Scanner(System.in);
	        choice = sc.nextInt();
	        sc.nextLine(); // Consume newline left-over

	        switch (choice) {
	            case 1:
	                addMarksForStudents();
	                break;
	            case 2:
	                viewAllStudents();
	                break;
	            case 0:
	                System.out.println("Returning to main menu...");
	                sc.close();
	                return(mainMenu());
	            default:
	                System.out.println("Invalid choice. Please enter a valid option.");
	                
	        }
	    }
	}
	   
	private static void removeStudent() {
	    Scanner sc = new Scanner(System.in);
	    
	    if (stud.isEmpty()) {
	        System.out.println("No students available to remove.");
	        return;
	    }
	    
	    System.out.print("Enter student Serial number to be removed: ");
	    int studentIdToRemove = sc.nextInt();
	    sc.close();
	    boolean found = false;
	    for (Student s : stud) {
	        if (s.getSr_num() == studentIdToRemove) {
	            stud.remove(s);
	            System.out.println("Student removed successfully.");
	            found = true;
	            break; // Exit loop once student is found and removed
	        }
	    }
	    
	    if (!found) {
	        System.out.println("Student with ID " + studentIdToRemove + " not found.");
	    }
	}

		
	

	private static void viewSpecificStudent() {
		Scanner sc = new Scanner(System.in);
	    
	    if (stud.isEmpty()) {
	        System.out.println("No students available.");
	        return;
	    }
	    
	    System.out.println("Enter student ID to view details: ");
	    int studentIdToView = sc.nextInt();
	    
	    boolean found = false;
	    for (Student s : stud) {
	        if (s.getSr_num() == studentIdToView) {
	            System.out.println("Student details:");
	            System.out.println(s);
	            found = true;
	            break; // Exit loop once student is found and details are displayed
	        }
	    }
	    
	    if (!found) {
	        System.out.println("Student with ID " + studentIdToView + " not found.");
	    }
	}
		
	

	private static void viewAllStudents() {
		
		if (stud.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : stud) {
                System.out.println(s);
            }
		
        }
	}
	private static boolean isValidFirstName(String firstName) {
        
        return !firstName.isEmpty() && firstName.matches("[a-zA-Z]+");
    }

	public static String getContactNumber(Scanner sc) {
        while (true) {
            System.out.print("Enter contact number (digits only): ");
            String input = sc.next().trim();

            if (input.matches("\\d+")) { // Check if input consists only of digits
                return input;
            } else {
            	System.out.println("Wrong Contact Number Input, Please Fill Again");
                return(getMenu());
            }
        }
    }

	private static void addStudent(ArrayList<Student> stud) {
		Scanner sc = new Scanner(System.in);
		int sr_num, fees;
		String first_name,  last_name,  subject,  contact;
		
		int addMore = 0;
		try{
			do {
		
			System.out.println("Enter a Serial Number ");
			sr_num = sc.nextInt();
			System.out.println("Enter First Name");
			first_name = sc.next().trim();
            while (!isValidFirstName(first_name)) {
                System.out.println("Invalid input for First Name. Please enter again: ");
                first_name = sc.next().trim();
            }
			System.out.println("Enter Last Name");
			last_name = sc.next();
			contact = getContactNumber(sc);
			System.out.println("Enter A Subject");
			subject = sc.next();
			
			System.out.println("Enter Fees");
			fees = sc.nextInt();
			
			Student newStudent = new Student(sr_num,first_name, last_name,contact, subject,fees);
			stud.add(newStudent);
			System.out.println("press 0 to  Go to previous menu");
	        System.out.println("To add another Student Record Press 1");
	        addMore = sc.nextInt();
	        }while(addMore == 1);
		
		    
		
		    }catch(InputMismatchException e)
		{ 
			e.getMessage();
			getMenu();
		}
		
	}

		
	

		private static void addMarksForStudents() {
	        if (stud.isEmpty()) {
	            System.out.println("No students available.");
	            return;
	        }

	        System.out.println("Adding marks for students:");
	        for (Student student : stud) {
	            System.out.println("Student ID: " + student.getSr_num() + ", Name: " + student.getFirst_name() + " " + student.getLast_name());
	            System.out.print("Enter marks for " + student.getFirst_name() + ": ");
	            Scanner sc = new Scanner(System.in);
	            int marks = sc.nextInt();
	            student.setMarks(marks);
	            System.out.println("Marks added successfully for " + student.getFirst_name() + ".");
	        }
	    
}
}