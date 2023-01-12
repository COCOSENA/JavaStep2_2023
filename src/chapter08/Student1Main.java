package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이재민");
		System.out.println(studentLee.StudentName);
		System.out.println(studentLee.getSerialNum());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;
		
		//static이니까 객체 안 쓰고 바로 불러올 수 있다
		
		Student1 studentkim=new Student1();
		studentkim.setStudentName("김창우");
		System.out.println(studentkim.StudentName);
		System.out.println(studentkim.getSerialNum());
		Student1.serialNum++;
		
		
		Student1 studentPark=new Student1();
		studentPark.setStudentName("박창훈");
		System.out.println(studentPark.StudentName);
		System.out.println(studentPark.getSerialNum());
		Student1.serialNum++;
		

	}

}
