package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {

	
	private LinkedList<Member> linkedList;
	
	//생성자를 통한 LinkedList 객체 생성
	public MemberLinkedList () {
		linkedList = new LinkedList<>(); //좌 멤버변수 //클래스 이름과 같은 생성자 
	}
	
	//addMember
	
	public void addMember(Member member) { //멤버객체
		linkedList.add(member); //만든 방 linkedList 에 넣어준다
	}
	

	
	//removeMember
		public boolean removeMember(int memberID) {
			Iterator<Member> ir=linkedList.iterator();
			
			while(ir.hasNext()) {
				Member member=ir.next();
				int tempID=member.getMemverID();
				if(tempID == member.getMemverID()) {
					linkedList.remove(member);
					return true;
				}
			}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
		}
		

	//showallMember
		public void showallMember() {
			for(Member member : linkedList) {
				System.out.println(member);
			}
			System.out.println();
		}
	
	
}
