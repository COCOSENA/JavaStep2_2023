package chapter11;

public class CarMain {
//	public static void main(String[] args) {
//		method(new ManualCar());
//		method(new AICar());
//		
//		
//		
//	}
//	
//	public static void method(Car car) {
//		car.drive();
//		car.stop();
//	}
	
	
	public static void main(String[] args) {
		//내 방법
		System.out.println("------자율주행-----");
		Car obj1 = new AICar();
		obj1.startCar();
		obj1.drive();
		obj1.stop();
		obj1.turnOff();
		System.out.println("-----사람이 운전하는 차-----");
		Car obj2 = new ManualCar();
		obj2.startCar();
		obj2.drive();
		obj2.stop();
		obj2.turnOff();
		
		//선생님 방법.★public final void run() 이거하나면 다 된다! ★
		System.out.println("------------자율주행-------------");
		Car mycar = new AICar();
		mycar.run();
		System.out.println("-------사람이 운전하는 자동차-----------");
		Car hiscar = new ManualCar();
		hiscar.run();
		
	
	}
}
