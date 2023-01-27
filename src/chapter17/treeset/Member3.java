package chapter17.treeset;

public class Member3 implements Comparable<Member3> {
//public class Member3 implements Comparable<Member3> { //compareTo
	
	private int memberID;
	private String memberName;
	
	public Member3() {
		
	}
	
	public Member3(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemverID() {
		return memberID;
	}

	public void setMemverID(int memverID) {
		this.memberID = memverID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 "+ memberID+ "입니다.";
	}
	//물리적인 값 
	//@Override
	//public int hashCode() {
		//memberName.hashCode() : String이므로 10진수 
		//return super.hashCode(); //10진수 메모리주소
		//방법1
		//return memberName.hashCode()+memberID;
		//방법2
		
	//}

	
	
	//논리적인 값
	//방법1 이름과 아이디 일치 
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member2) {
//			Member2 member = (Member2)obj;
//			return member.memberName.equals(memberName) && (member.memberID == memberID);
//			
//		}
//		return false;
//				
//	}
//	
	//방법2
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member3) {
//			Member3 member = (Member3)obj;
//			if(this.memberID == member.memberID) {
//				return true;
//			}
//			
//		}
//		return false;
//	}

	
	public int compare(Member3 member1, Member3 member2) {
		return (member1.memberID - member2.memberID);
	}

	@Override
	public int compareTo(Member3 o) {
		// TODO Auto-generated method stub
		return 0;
	}



}
