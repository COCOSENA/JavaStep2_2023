package chapter08;

public class Guide {
	
	
	
	
	static String point;
	Guest[] guest; //배열선언//★
	
	
	
	//생성자 초기화(n은 관광객수)
	public Guide(int n) {
		point="발리"; //목적지 
		guest=new Guest[n]; //관광객 수만큼 메모리확보
	
		
	
	//객체 생성
	for(int i=0; i < guest.length; i++) {
		guest[i]=new Guest(); //★
		
	
		
	}
	
	
	
	}
	
}
