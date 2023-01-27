package chapter17.arraylist;

import chapter17.Member;
import chapter17.linkedlist.MemberLinkedList;

public class MemberLinkedMain {

	public static void main(String[] args) {
		//순서 o, 중복o
		//팀원들의 정보
		MemberLinkedList memberLiknkedList = new MemberLinkedList();
		
		Member memberKim1=new Member(1001, "김창우");
		Member memberKim2=new Member(1002, "김우태");
		Member memberPack=new Member(1003, "백유기");
		Member memberPark=new Member(1004, "박수연");
		
		//회원가입
		memberLiknkedList.addMember(memberKim1);
		memberLiknkedList.addMember(memberKim2);
		memberLiknkedList.addMember(memberPack);
		memberLiknkedList.addMember(memberPark);
		
		memberLiknkedList.showallMember();
		memberLiknkedList.removeMember(memberKim1.getMemverID());
		memberLiknkedList.showallMember();

		
		
		
		

	}

}
