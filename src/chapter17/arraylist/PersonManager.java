package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select; //int 타입 변수방 select 
		Person p; //Person 타입 변수방 p 
		
		ArrayList<Person> personArr=new ArrayList<Person>();      
		
		while(true) {
			
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종  료");
			System.out.print("항목선택 : ");
			
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			
			//if switch
			switch (select) {
			
			case 1: //정보추가
				
				//정보를 추가할때마다 Person객체를 새로 생성한다.
				//변수방 p에 값을 넣어준다. 
				////회원가입을 할 수 있는 저장공간, 메모리 만들기
				
				p = new Person();
				System.out.println("----정보 추가---- ");
				System.out.println("이름 : ");
				p.setName(scan.next());
				System.out.println("나이 : ");
				p.setAge(scan.nextInt());
				System.out.println("전화 : ");
				p.setTel(scan.next());
				//====
				personArr.add(p);
				System.out.println("정보가 저장되었습니다. ");
				System.out.println("-------------------");
				break;
				
			case 2: //회원탈퇴
				System.out.println("----정보 삭제---- ");
				System.out.println("삭제할 이름 : ");
				String name = scan.next();
				for(int i=0; i < personArr.size() ; i++) {
					if(personArr.get(i).getName().equals(name)) {
						personArr.remove(i);
						System.out.println(name + "님의 정보를 삭제 했습니다.");
						break;
					}else {
						if( i+1 == personArr.size())
						System.out.println(name + "님의 정보가 일치 하지 않습니다.");
					}
				}
				break;
			case 3: //정보조회
				System.out.println("---전체정보---");
				for(int i=0; i < personArr.size() ; i++) {
	
						System.out.println("이름 : "+ personArr.get(i).getName());
						System.out.println("나이 : "+ personArr.get(i).getAge());
						System.out.println("번호 : "+ personArr.get(i).getTel());
					}
				break;
			case 4: 
				System.out.println("프로그램 종료");
				return;
				}
		
			}//switch
		}
	}

