package chapter12.Multiinterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println(" R or r : 한명씩 차례로 할당");
			System.out.println(" L or l : 쉬고 있거나 대기가 가장 적인 상담원에게 할당");
			System.out.println(" P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println(" S or s : 종료");
			System.out.println("전화 상담 방식을 선택하세요 : ");
		
			
			//문자를 아스키코드로 	// 문자를 숫자로 바꿀 때 at	
			//방법1 
			//charAt(0) : 문자(char) 또는 문자열 (String) => ASCII 즉 int
			//★방법2
			//★String mun = scan.nextLine();
			//★int ch = mun.charAt(0); // charAt(0): String > ACSII(int)
			
			Scheduler scheduler = null; //★여러개 만들어야한다????? 
			char alpa = scan.nextLine().charAt(0);
			if(alpa == 82 || alpa == 114) { 
				RoundRobin obj1 = new RoundRobin();
				obj1.getNextCall();
				obj1.sendCallToAgent();
			
				}else if (alpa == 76 || alpa == 108) {
					LeastJob obj2 = new LeastJob();
					obj2.getNextCall();
					obj2.sendCallToAgent();
				
				}else if(alpa == 80 || alpa == 112) {
					PriorityAllocation obj3 = new PriorityAllocation();
					obj3.getNextCall();
					obj3.sendCallToAgent();
				
				}else if(alpa == 83 || alpa == 115) {
					System.out.println("종료");
				break;
				}
		

		}//WHILE
		
		}//MAIN 
		
	}//CLASS 


