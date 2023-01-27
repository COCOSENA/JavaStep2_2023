package chapter19.lambda;

interface PringString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		//람다식
		PringString lambdaStr= s->System.out.println(s); //함수명을 변수명으로 대체
		showMyString(lambdaStr);
		
		PringString reStr=returnString(); // returnString() 메소드 안에 있는 람다식 구현부 호출
		reStr.showString("Hello");
		
	}

	
		public static void showMyString(PringString p) { //매개변수 구현=> p가 body
			p.showString("Hello lambda");
			
		}
		
		public static PringString returnString() { //반환값으로 body구현
			return s->System.out.println(s + "world");
			
			
		}
}
