package chapter08;

public class StaticFunction {

//static은 static으로 통한다 / 객체만들필요없x 
	
		
		String str1="일반 회원변수";
		static String str2="station 회원변수";
		
		public static String getStatic() {
			//static 메소드는 static 변수만 사용이 가능하다 
			//str2="VIP";
			
			
			return str2;
		
	}//main

}//c
