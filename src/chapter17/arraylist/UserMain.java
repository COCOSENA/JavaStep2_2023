package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr = new ArrayList<>();
		
		outer : while(true) {
			
			System.out.println("아이디 생성 : ");
			Scanner scan = new Scanner(System.in);
			
			UserInfo ui=new UserInfo();
			ui.setId(scan.next());
			
			//아이디 중복 체크★
			for(int i=0; i<arr.size() ; i++) {
				if(ui.getId().equals(arr.get(i).getId())) {
					System.out.println("아이디가 중복 됩니다. 다른 아이디를 입력하세요.");
					continue outer;
				}
			}
			//중복된 아이디가 아니라면 pwd입력
			System.out.print("패스워드를 입력하세요 : ");
			Scanner scan2 = new Scanner(System.in);
			ui.setPwd(scan2.nextInt());
			
			arr.add(ui);
			
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
			}
			
		}

	}

}
