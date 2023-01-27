package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		//vip고객
	
		System.out.println("-----------vip고객--------------");
		int price=10000;
		VIPCustomer vipcs=new VIPCustomer(1004, "홍길동", 900);
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName() + "님이" + vipprice + "원을 지불 완료 하였습니다. ");
		System.out.println(vipcs.showCustomer());

		
		System.out.println("-----------일반고객--------------");
		price=10000;
		Customer something = new Customer();
		something.setCustomerName("일반고객");

		
		System.out.println(something.getCustomerName()+ "님이" + something.calcPrice(price) + "원을 지불 완료 하였습니다.");
		System.out.println(something.showCustomer());
		
		
	
		
		

		
	}

}
