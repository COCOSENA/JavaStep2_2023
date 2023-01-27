package Sena_Prac;

public class Order {

	
	 int orderNumber; //주문번호
	 String ID; //주문자아이디
	 String date; //주문날짜
	 String name; //주문자이름
	 String proNumber; //주문상품번호
	 String addRess; //배송주소 
	 
	 //메소드 초기화 
	
	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProNumber() {
		return proNumber;
	}

	public void setProNumber(String proNumber) {
		this.proNumber = proNumber;
	}

	public String getAddRess() {
		return addRess;
	}

	public void setAddRess(String addRess) {
		this.addRess = addRess;
	}

	

//-----------------------------------------------------------------------------------------
		public static void main(String[] args) {
		
		Order today=new Order();
		today.orderNumber=2018;
		today.ID="abc123";
		today.date="2018년 3월 12일";
		today.name="홍길순";
		today.proNumber="PD0345-12";
		today.addRess="서울 영등포구 여의도동 20번지";
		
		//멤버변수 사용
		System.out.println("주문번호 : "+ today.orderNumber + "03120001"); 
		System.out.println("주문자 아이디 : "+ today.ID); 
		System.out.println("주문 날짜 : "+ today.date); 
		System.out.println("주문자 이름 : "+ today.name); 
		System.out.println("주문 상품 번호 : "+ today.proNumber); 
		System.out.println("배송 주소: "+ today.addRess); 
			
		System.out.println("---------------------------------------------------");
		
		//메소드 사용
		System.out.println("주문번호 : "+ today.getOrderNumber() + "03120001"); 
		System.out.println("주문자 아이디 : "+ today.getID()); 
		System.out.println("주문 날짜 : "+ today.getDate()); 
		System.out.println("주문자 이름 : "+ today.getName()); 
		System.out.println("주문 상품 번호 : "+ today.getProNumber()); 
		System.out.println("배송 주소: "+ today.getAddRess()); 

	}

}
