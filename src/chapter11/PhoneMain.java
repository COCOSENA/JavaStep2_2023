package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//내방법
		Phone obj=new SmartPhone(null);
		obj.owner="김유신님";
		System.out.println(obj.owner);
		obj.turnOn();
		obj.turnOff();
		
		//선생님방법
		//Phone phone=new Phone(); 
		//생성자를 반드시 오버로딩
				
		SmartPhone smartPhone = new SmartPhone("김유신");
		System.out.println(smartPhone.owner + "님");
		smartPhone.turnOn();
		smartPhone.turnOff();

		
		
	}

}
