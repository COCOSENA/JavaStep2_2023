package chapter09;

public class Student extends People{
	
	public int StudentNo;
	
	public Student(String name, String ssn, int StudentNo) {
		super(name, ssn); //오버로딩된 부모클래스의 생성자를 호출하여 초기화한다.
		this.StudentNo=StudentNo;
		
		
	}

}
