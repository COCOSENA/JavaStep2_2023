package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter17.Member;

public class MemberArrayList { //거꾸로 눌러서 들어가보고 디버깅

	
	//ArrayList 선언(arrayList)
	private ArrayList<Member> arrayList;
	
	//heap 생성 = 객체생성 
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();

	}
	
	//저장 : arrayList에 add하는 메소드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	
	//삭제 : arrayList에 remove하는 메소드
	public boolean removeMember(int memberID) {
		Iterator<Member> it = arrayList.iterator();
				
				while(it.hasNext()) {
					Member member=it.next();
					int tempId=member.getMemverID();
					if(tempId == memberID) {
						arrayList.remove(member);
						return true;		
					}//if
				}//while
				System.out.println(memberID + "가 존재하지 않습니다.");
				return false;
	}

	
	//정보출력 메소드 : arrayList 출력하기
	public void showAllMember() {
		for(Member member: arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
