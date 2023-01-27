package chapter14.Wrapper;

//Wrapper 
// 기본 타입의 데이터를 객체로 표현해야 할 때, 
//기본 자료타입(primitive type)을 객체로 다루기 위해서 사용하는 클래스들
//기본 타입의 값-> 포장 객체 : 박싱, 포장객체 ->기본타입 값 : 언박싱
public class IntegerTest {

	public static void main(String[] args) {
		
		//Integer i=new Integer(100); //int i=100
		
		Integer num=100; //오토박싱 : 일반자료int => 클래스Integer로 선언
		
		int iNum=num.intValue();//언박싱 : 클래스Integer => 일반자료int
		
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
		
		
		//언박싱(Integer => int)
		int total=num+jNum; // num.intValue+jNum
		System.out.println(total);
		
		
		//오토박싱(int => Integer)
		Integer i=jNum;
		System.out.println(i); //Integer.valueOf(jNum)로 변환하는 것과 같음
		
		
		
	}

}
