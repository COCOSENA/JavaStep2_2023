package chapter12.Multiinterface;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		System.out.println("=======Buy=======");
		Buy buyer=customer; //구현되는 부분의 객체를 넘겨줌
		buyer.buy();
		buyer.order();
		Sell seller=customer;
		System.out.println("=======Sell=======");
		seller.sell();
		seller.sellorder();
		//seller 부모 // Customer 자식
		
	}

	
}
