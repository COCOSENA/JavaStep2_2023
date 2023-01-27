package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//x,y,MyInterface 클래스 타입의 변수를 선언하여 출력 
		MyClass obj = new MyClass ();
		obj.x();
		obj.y();
		obj.myMethod();
		
		
		//=====선생님 
		MyClass mClass=new MyClass(); //x 클래스 타입의 인스턴스 변수 
		X xClass=mClass;
		xClass.x();
		System.out.println("------------------");
		
		Y yClass=mClass;
		yClass.y();
		System.out.println("------------------");
		
		MyInterface iClass=mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}

}
