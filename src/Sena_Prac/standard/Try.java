package Sena_Prac.standard;

public class Try {
	
	public static void main(String[] args) {
		System.out.println(1); // o
		System.out.println(2); // o
		
		try { //예외가 발생할 가능성이 있는 코드 
			System.out.println(3/0);
			System.out.println(4);
		
		} catch (ArithmeticException e) { //Exception1 발생했을 때 처리를 위한 코드 
			if (e instanceof ArithmeticException)
				System.out.println("true"); //o
			System.out.println("ArithmeticException"); //o
		}catch (Exception e) { //Exception2 발생했을 때 처리를 위한 코드 
			System.out.println("Exception");
		}
		System.out.println(6); //o
	} //main

}//class
