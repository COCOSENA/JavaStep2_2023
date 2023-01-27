package Sena_Prac.standard;

public class Product {
	
	int price;
	int bonusPoint;
	
	// 매개변수가 있는 생성자?~~ 
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}



class Tv extends Product{
	Tv(){
		super(100);
	}
}



class Computer extends Product{
	Computer(){
		super(200);
	}


	public String toString() {
		return "Computer";
	}

}


class Buyer{ //바이어 클래스의 
	int money = 1000; //매개변수
	int bonusPoint = 0;
	
	
}

//만만치않은 다형성..............