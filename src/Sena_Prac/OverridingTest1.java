package Sena_Prac;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "가 지불할 금액은" + customerLee.calPrice(price)+ "원 입니다.");
		System.out.println(customerKim.getCustomerName() + "가 지불할 금액은" + customerKim.calPrice(price)+"원 입니다.");
		System.out.println(vc.getCustomerName()+ "가 지지불할 금액은 "+ vc.calPrice(price)+"원 입니다." );
	
	}

}
