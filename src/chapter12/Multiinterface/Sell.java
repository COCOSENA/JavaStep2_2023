package chapter12.Multiinterface;

public interface Sell {
	
	void sell();
	
	
	//같은 이름의 default 메소드는 존재할 수 없으므로 오버라이딩 해줘야함
	
	
	default void sellorder() {
		System.out.println("판매 주문");
	}

}
