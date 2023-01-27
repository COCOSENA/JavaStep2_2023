package chapter22; //이것도 암기 

public class ThreadEx01 extends Thread{ //Thread 는 run 하나로 돌린다 

	@Override
	public void run() {

		//프로세스의 독립적인 수행을 위한 영역 
		for(int i=0; i<10; i++) {
			System.out.println(i+"번째 스레드 실행");
		}
		
		
	}
	
	

}
