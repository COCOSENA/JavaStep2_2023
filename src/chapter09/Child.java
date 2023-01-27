package chapter09;

public class Child extends Parent {

	@Override //오버로딩: 메소드 이름 같고 매개변수 다를 수 있음(다시 만듦. 최근것 순위로)
	//오버라이딩은 상속시 사용가능, 매개변수까지 같음 //통일성, 다형성 
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}

	
	
	
}
