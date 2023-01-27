package chapter17;

public class Member {
	
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
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
	
	
	

}
