package chapter14.Clone;

public class ObjectCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 30);
		Circle circleCopy=(Circle) circle.clone(); //다운캐스팅. 우항이 최상위 object 
		
		System.out.println(circle);
		System.out.println(circleCopy);
		
		
		//hash 값 : 값이 다르니까 깊은 복사다 
		System.out.println(System.identityHashCode(circleCopy));
		System.out.println(System.identityHashCode(circle));
	}

}
