package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode =SupersonicAirplane.SUPERSONIC; //static이면 클래스명으로 쓸 수 있다. 
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
