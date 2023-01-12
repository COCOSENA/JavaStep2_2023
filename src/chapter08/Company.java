package chapter08;

public class Company {
	
	//객체를 단 하나만 생성하는 클래스(객체는 무한대로 만들어도 되지만!)
	private static Company instance=new Company(); //힙메모리 만들어서 클래스 등록시키는 것! 객체생성, 메소드 통해서만 나갈수있음
	//static 은 객체나 메소드로도 사용가능.
	
	//일반적인 객체생성
	public Company() {
		
	}
	
	
	//singleton 객체 생성 메소드
	public static Company getInstance() {
		//예외처리
		if(instance == null) {
			instance=new Company();
	
		}
		
		return instance;
		
	}
	

}
