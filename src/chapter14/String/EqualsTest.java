package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {
		//String 클래스는 이미 toSting 으로 재정의 되어있음
		String str1=new String("test");
		String str2=new String("test");
		
		Student studentLee = new Student(100, "이상우");
		Student studentLee2 = studentLee; //그냥 넘겨준거 
		Student studentSang = new Student(100, "이상우"); //new로 새로 받은 거 
		
		//동일한 주소의 두 인스턴스 비교(물리적 논리적 값이 동일)
		System.out.println("------동일한 주소의 두 인스턴스 비교------");
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		//주소를 넘긴 것과 같음,, 
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		System.out.println();
		
		
		
		
		
		//물리적 주소는 다르지만 논리적 값이 동일
		System.out.println("------물리적 주소(==)는 다르지만 논리적 값이 동일(equals)------");
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
				//주소를 넘긴 것과 같음,, 
				
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
			System.out.println();
			
			
			System.out.println("------------데이터 값 출력------------");
			System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
			System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
			
			System.out.println("--------데이터 값 같으나 hash값이 다르므로 재정의가 필요--------");
			System.out.println("studentLee의 실제 주소 값 : " + System.identityHashCode(studentLee));
			System.out.println("studentSang의 실제 주소 값 : " + System.identityHashCode(studentSang));
			System.out.println();
			
			
			//HashCode가 재정의 되어 있음
			System.out.println("=====String 클래스의 실제 값 출력 ======");
			System.out.println("str1의 hashCode : " + str1.hashCode());
			System.out.println("str2의 hashCode : " + str2.hashCode());
			
			
	}

}
