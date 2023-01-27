package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//리스트 구조를 갖는 ArrayList 클래스의 객체생성
		//배열 : String[] ls1 = {}; 초기화, fixed
		List<String> ls = new ArrayList<String>();
		//리스트에 데이터추가
		ls.add("Hi!");
		ls.add("Happy!");
		ls.add("Nice!");
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i + ":" + ls.get(i));
		}
		System.out.println();
		System.out.println("-------데이터 추가 후 -------");
		ls.add(3, "Good");
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i + ":" + ls.get(i));
		}
		System.out.println();
		System.out.println("-------데이터 삭제 후 -------");
		ls.remove(0); // 값이 땡겨져온다 fixed가 아니라 linked 
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i + ":" + ls.get(i));
		}
	}

}
