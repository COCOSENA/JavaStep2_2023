package chapter16.generic1;

class MyArray{
	
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
		
	}
	
	public Object get(int index) {
		return array[index];
	}
}

public class MyArrayTest1 {

	public static void main(String[] args) {
		
		MyArray myArray1 = new MyArray();
		myArray1.add(new String("test")); //★아까말한중요한문법
		String str = (String) myArray1.get(0); // 다운캐스팅 
		System.out.println(str);
		
		MyArray myArray2 = new MyArray();
		myArray2.add(new Integer(100)); //★일반int가 못 들어가서 오토박스 Integer
		Integer num = (Integer) myArray2.get(0); // 다운캐스팅 
		System.out.println(num);
		
		
		
	}

}
