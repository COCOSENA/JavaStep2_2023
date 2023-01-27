package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member2;

public class MemberLinkedList {

	private HashSet<Member2> hashSet;
	
	//생성자를 통한 LinkedList 객체 생성
	public MemberLinkedList () {
		hashSet = new HashSet<>(); //좌 멤버변수 //클래스 이름과 같은 생성자 
	}
	
	//addMember2
	
	public void addMember2(Member2 Member2) { //멤버객체
		hashSet.add(Member2); //만든 방 linkedList 에 넣어준다
	}
	

	
	//removeMember2
		public boolean removeMember2(int Member2ID) {
			Iterator<Member2> ir=hashSet.iterator();
			
			while(ir.hasNext()) {
				Member2 Member2=ir.next();
				int tempID=Member2.getMemberId();
				if(tempID == Member2.getMemberId()) {
					hashSet.remove(Member2);
					return true;
				}
			}
		System.out.println(Member2ID + "가 존재하지 않습니다.");
		return false;
		}
		

	//showallMember2
		public void showallMember2() {
			for(Member2 Member2 : hashSet) {
				System.out.println(Member2);
			}
			System.out.println();
		}
	
	
}
