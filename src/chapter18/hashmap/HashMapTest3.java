package chapter18.hashmap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest3 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Spirng", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scan= new Scanner(System.in);
		
		while(true) { //입력한 아이디의 존재여부 
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디 : ");
			String id=scan.next(); 
			System.out.println();
			
			if(map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String pw=scan.next(); 
				if(map.get(id).equals(pw)){
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");	
					continue;
				}//inner if
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다.");
			}//out if
			
		}//while 
		
	}

}
