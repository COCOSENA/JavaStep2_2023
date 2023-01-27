package chapter10;

public class CalculatorExamMain {

	public static void main(String[] args) {
		var CalPlus = new CalPlus();
		CalPlus.getResult(20, 10);
		System.out.println("CalPlus 값 : " + CalPlus.getResult(20, 10));

		var CalMinus = new CalMinus();
		CalMinus.getResult(20, 5);
		System.out.println("CalPlus 값 : " + CalMinus.getResult(20, 5));

		// getClass().getSimpleName() : 클래스명 가져오기

	}// MAIN

	// 방법2: 선생님 방식! 메소드를 만든다
		
	
	
		

		public static int calc(CalculatorExam c1, int a, int b) { // static 같은 영역이라 바로 불러와서 쓸 수 있다
			return c1.getResult(a, b);

		}
		
}	
