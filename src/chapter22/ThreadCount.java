package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable{

	private int n;
	
	public ThreadCount(int n) {
		this.n=n;
	}
	
	public static void main(String[] args) {
		
		
		System.out.print("값을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		ThreadCount tc = new ThreadCount(num);
		//스레드 객체 및 실행
		Thread t = new Thread(tc); //일반객체 ->Thread
		t.start(); //start 독립성 유지 
		
		
		}
	
	
	@Override
	public void run() {
		for(int i=n; i>=0; i--) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("종료");
	}

}
