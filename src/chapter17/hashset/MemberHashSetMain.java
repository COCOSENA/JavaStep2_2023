package chapter17.hashset;

import java.util.HashSet;
import java.util.Set;
import chapter17.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
	Set<Member> set = new HashSet<Member>();
	
	set.add(new Member(30, "홍길동"));
	set.add(new Member(30, "홍길동")); //중복 안되니까 저장되면 안됨

	System.out.println("총 객체수 : "  + set.size());
	
	}

}
