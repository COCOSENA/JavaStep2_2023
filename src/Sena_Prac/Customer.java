package Sena_Prac;

public class Customer {
	//멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//디폴트 생성자
	public Customer() {}
	public Customer(int customerID, String customerName) {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		this.customerName=customerName; //★
		
		//System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 계산 
		return price;
	}
	
	public String showCustomerInfo() { //고객정보를 반환하는 메서드
		return customerName + "님의 등급은" +  customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	} 

	
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
