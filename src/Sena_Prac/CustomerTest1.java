package Sena_Prac;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(); //★
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerJeong = new VIPCustomer(); //★
		customerJeong.setCustomerID(10020);
		customerJeong.setCustomerName("정냠냠");
		customerJeong.bonusPoint=20000;
		System.out.println(customerJeong.showCustomerInfo());
	}

}
