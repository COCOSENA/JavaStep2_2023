package chapter09;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agenID) {
		super(customerID, customerName);
		//this.customerID=customerID; //super안 쓸 때 사용가능 
		//this.customerName=customerName;
		customerGrade="VIP";
		bounsRatio=0.05;
		this.saleRatio=0.1;
		this.agentID=agentID; //전문상담원 
		
		
	}

	@Override
	public int calcPrice(int price) {
		bounsPoint=(price-(int)(price*saleRatio))*bounsRatio;
		return price-(int)(price*saleRatio); //물건가격 
	}

	@Override
	public String showCustomer() {
		return super.showCustomer() + "\n전문상담원은" + agentID + "입니다";
	}

	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
