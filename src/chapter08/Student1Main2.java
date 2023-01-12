package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이재민");
		studentLee.studentID=studentLee.serialNum;
		System.out.println("이름 : " + studentLee.StudentName +
				" 아이디 :"+ studentLee.studentID);
	
		Student1.serialNum++;
		
		//static 이니까 객체 안 쓰고 바로 불러올 수 있다
		
		Student1 studentkim=new Student1();
		studentkim.setStudentName("김창우");
		studentkim.studentID=studentkim.serialNum;
		System.out.println("이름 : " + studentkim.StudentName +
				" 아이디 :"+ studentkim.studentID);
	
		Student1.serialNum++;
		
		Student1 studentPark=new Student1();
		studentPark.setStudentName("박창훈");
		studentPark.studentID=studentPark.serialNum;
		System.out.println("이름 : " + studentPark.StudentName +
				" 아이디 :"+ studentPark.studentID);
	
		Student1.serialNum++;
		

	}

}
