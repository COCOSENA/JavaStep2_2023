package chapter16.generic1;
//제네릭 : 구체적인 타입을 적지 않고 변수형태로 지정하는 것. 
//객체를 생성할 때 지정하고, 형변환을 쉽게 하기 위해서 


class MyArrayG<E>{ //E가 매개변수. 
	
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
		
	}
	
	public E get(int index) { //E가 매개변수. 
		return (E) array[index];
	}
}

public class MyArrayTest2 {

	public static void main(String[] args) {
		
		MyArrayG<String> myArray1= new MyArrayG<>();
		myArray1.add(new String("test")); 
		String str = myArray1.get(0); 
		System.out.println(str);
		
		MyArrayG<Integer> myArray2 = new MyArrayG<>();
		myArray2.add(new Integer(100)); 
		Integer num = myArray2.get(0);
		System.out.println(num);
		
		
		
	}

}
