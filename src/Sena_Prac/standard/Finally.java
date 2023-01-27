package Sena_Prac.standard;

public class Finally { // 트라이캐치문과 함께 예외의 발생여부와 관계 없이 
	//실행되어야할 코드를 포함시킬 목적으로 사용 됨 

	public static void main(String[] args) {
		method1(); //메소드인가....
		System.out.println("메소드가 끝나고 메소드1을 메인에서 리턴한다"); //3
	}
	
	static void method1() {
		try {
			System.out.println("메소드1이 부른다~"); //1 
			return;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("메소드 1이 마침내 막힌다~?"); //2 
		}
	}
}

//실행결과를 보면 try블럭에서 return문이 실행되더라도
//finally블럭이 먼저 완료 되고 메소드 종료
