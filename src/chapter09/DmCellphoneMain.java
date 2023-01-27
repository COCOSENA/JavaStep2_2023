package chapter09;

public class DmCellphoneMain {

	public static void main(String[] args) {
		
		DmCellphone dmbCellPhone =new DmCellphone("java폰", "검정", 10);
		
		
		//Cellphone으로부터 상속받은 필드
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		
		//DmbCellphone의 필드
		System.out.println(dmbCellPhone.channel);
		
		//Cellphone의 메소드를 사용하여 전화통화 구현
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕!!");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 메소드를 사용하여 채널을 바꾸기 
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(5);
		
		

	}

}
