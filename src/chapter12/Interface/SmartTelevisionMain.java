package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
	
		
		SmartTelevision tv=new SmartTelevision();
		
		
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("----");
		
		//Remote 클래스에 정의 되어 있는 메소드만
		//오버라이딩된 메소드 대입 
		//=자기가 가지고 있는 것만(설계도) 할당 가능
		Remote rc=tv;
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		//rc.serch("www.naver.com");
		
		
		Remote sc=tv;
//		rc.turnOn();
//		rc.setVolume(10);
//		rc.turnOff();
		//sc.search();
		
	}

}
