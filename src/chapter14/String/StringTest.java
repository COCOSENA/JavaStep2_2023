package chapter14.String;
//오늘 배운건 암기~! 

public class StringTest {
	
	public static void main(String[] args) {
		
		String str="";
		String str1="Hi everybody!";
		String str2=" Have a nice Day! ";
		
		System.out.println();
		//스트링의 실제 주소
		
		str=str1+str2;
		System.out.println(System.identityHashCode(str1)); //주소 같음
		System.out.println(str);
		//str1의 다른 주소 생성
		str1=str1.concat(str2); //Hi everybody! Have a nice Day! 
		System.out.println(System.identityHashCode(str1)); //주소 바뀜
		
		//str1의 같은 주소 생성
		str=str1.concat(str2); 
		System.out.println(System.identityHashCode(str1)); //주소 같음 

		System.out.println("str1 글자수 : "+ str1.length());
		System.out.println("str2 글자수 : "+ str2.length());
		System.out.println("str2 d글자 위치 : "+ str1.indexOf('d'));
		System.out.println("str2 D글자 위치 : "+ str2.indexOf('D'));
		
		System.out.println("str1 모두 소문자로 : "+ str1.toLowerCase());
		System.out.println("str2 모두 소문자로 : "+ str2.toLowerCase());
		
		System.out.println("str1 모두 대문자로 : "+ str1.toUpperCase());
		System.out.println("str2 모두 대문자로 : "+ str2.toUpperCase());
		
	}

}
