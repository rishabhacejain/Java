package jdbc_Assessment;

public class Student {
	private int sr_num, fees,marks;
	
		
	
	@Override
	public String toString() {
		return "Student [Sr No: " + sr_num + ", First Name: " + first_name
				+ " Last Name: " + last_name  + " Contact Number : " + contact + " Subject: " + subject + " Marks: " + marks + " Fee: " + fees + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private String first_name,last_name,subject,contact;
	public Student(int sr_num, String first_name, String last_name,String contact, String subject, int fees) {
		
		this.sr_num = sr_num;
		this.fees = fees;
		this.first_name = first_name;
		this.last_name = last_name;
		this.subject = subject;
		this.contact = contact;
		this.marks = marks;
	}
	public int getSr_num() {
		return sr_num;
	}
	public void setSr_num(int sr_num) {
		this.sr_num = sr_num;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
