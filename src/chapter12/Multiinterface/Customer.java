package chapter12.Multiinterface;

public class Customer implements Buy, Sell {

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
		
		
	//같은 메소드명이 존재하면 오버라이딩 필수
		
	}

}
