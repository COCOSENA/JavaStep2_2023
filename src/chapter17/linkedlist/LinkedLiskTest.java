package chapter17.linkedlist;

import java.util.LinkedList;

public class LinkedLiskTest {

	public static void main(String[] args) {
		//특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞뒤 링크로 연결
		//빈번한 객체 삭제 삽입이 일어나는 곳에서 ArrayList보다 성능이 좋다=빠름빠름 
		
		LinkedList<String> mylist = new LinkedList<String>();
		
		mylist.add("a");
		mylist.add("b");
		mylist.add("c");
		
		System.out.println(mylist);
		mylist.add(1, "d");
		
		System.out.println(mylist);
		
		mylist.addFirst("o");
		System.out.println(mylist.removeLast());
		
		mylist.addLast("g");
		System.out.println(mylist);

	}

}
