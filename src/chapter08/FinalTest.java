package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {

	//멤버변수(를 전연변수로 만들 수 있음)
	private static final int MAX=3; //전역변수이면서 상수.고정시키고 싶을때 static final
	
	public static void main(String[] args) {
		//지역변수
		int num=0;
		
		for(int i=0; i<MAX; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
			
			if(num > MAX) 
				System.out.println("입력값이 3보다 더 큽니다");
			else
				System.out.println("입력값이 3보다 크지 않습니다.");
		}
		

	}//m

}//c
