package chapter09;

public class Strawberry extends Berry{ //자바는 상속 하나만 받을 수 있음 

	private String color;
	private int price;
	
	//setter
	public void Set3(String a, int b) {
		color=a;
		price=b;
	}
	
	//getter
	public void Disp3() {
		System.out.println("색깔:"+ color);
		System.out.println("가격:"+ price);
	
}
	
}
