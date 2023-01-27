package chapter14.String;

public class Student {
	
	int studentId;
	String studentName;
	
	//생성자 
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	
	}
	
	@Override
	public String toString() {
	
		return studentId+", " +studentName;
	}
	
	//물리적 주소
	@Override
	public int hashCode() {
		return studentId;
		
		
	}

	@Override
	public boolean equals(Object obj) { //equals : 객체가 맞는지 판단 
		
		if(obj instanceof Student) {
			Student std=(Student)obj; //다운캐스팅. 부모꺼를 다 받은 std 
			if(studentId == std.studentId) // 비교판단
				return true;
			else
				return false;
			
		}
		return false;
	}
}
