package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayExam1 {

	public static void main(String[] args) {
		// Collerction => List => ArrayList
		ArrayList<Integer> list = new ArrayList();
		System.out.println("list.size():" + list.size());
		
		list.add(100);
		list.add(20);
		System.out.println("list.size():" + list.size());
		
		for(int i=0; i<list.size() ; i++)
			System.out.println(list.get(i));
		
		//인덱스로 접근하는 구조는 깊이가 있으면 있을수록 속도가 느려진다 
		//그 문제점을 해결하기 위해서 Iterator
		System.out.println("-------------------------------");
		//1) List구조의 자원을 반복자로 변환
		Iterator<Integer> it = list.iterator(); //★암기. 스프링에서 쓰임
		//2) 반복자를 반복문으로 수행
		while(it.hasNext()) { //반복자 안에서 커서가 이동
			int v=it.next(); //int니까 "언박싱" 하여 객체를 기본자료형으로!!
			System.out.println(v);
		}

	}
	
}
