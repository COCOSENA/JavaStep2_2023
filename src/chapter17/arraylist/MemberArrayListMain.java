package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		//팀원들의 정보
		Member memberKim1=new Member(1001, "김창우");
		Member memberKim2=new Member(1002, "김우태");
		Member memberPack=new Member(1003, "백유기");
		Member memberPark=new Member(1004, "박수연");

		//회원가입 
		memberArrayList.addMember(memberKim1); // 멤버의 객체가 들어가야함
		memberArrayList.addMember(memberKim2); // 멤버의 객체가 들어가야함
		memberArrayList.addMember(memberPack); // 멤버의 객체가 들어가야함
		memberArrayList.addMember(memberPark); // 멤버의 객체가 들어가야함
		
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberKim1.getMemverID());
		memberArrayList.showAllMember();

	}

}
