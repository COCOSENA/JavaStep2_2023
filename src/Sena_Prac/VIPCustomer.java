package Sena_Prac;

	public class VIPCustomer extends Customer{
		private int agentID;
		double saleRatio;
		
		public VIPCustomer() {}
		public VIPCustomer(int customerID, String customerName, int agenID) {
			super(customerID, customerName);
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
			//System.out.println("VIPCustomer(int, String, int) 생성자 호출");
		
		}
		
		@Override //재정의한 메소드
		public int calPrice(int price) {
			bonusPoint += price * bonusRatio; // 보너스포인트적립
			return price - (int)(price*saleRatio);
			//할인율을 계산하여 정가에서 뺀 후 세일 가격 반환
		}

		public int getAgentID() {
			return agentID;
			
		}
	}
	
