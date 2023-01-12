package chapter08;

public class student2 {

	public static int serialNum=9999;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	public student2() {
		serialNum++;
		this.studentID=serialNum;
	}
	
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	
	
	
}
