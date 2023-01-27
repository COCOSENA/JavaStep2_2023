package chapter22;

import java.util.Random;

public class RunnerMain {
	

	
	public static void Runset() {
		
	
		int[] playerRandom = new int[5];
		String[] playerJump = { "", "", "", "", "" };
		for (int i = 0; i < playerRandom.length; i++) {
			playerRandom[i] = new Random().nextInt(4);
	}
}
	
	public static void Rest() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void Running() {
		int[] playerRandom = new int[5];
		String[] playerJump = { "", "", "", "", "" };
	
		for (int i = 0; i < playerJump.length; i++) {

			switch (playerRandom[i]) {
			case 0:
				playerJump[i] += "";
				break;
			case 1:
				playerJump[i] += "  ";
				break;
			case 2:
				playerJump[i] += "    ";
				break;
			case 3:
				playerJump[i] += "      ";
				break;
			}
	}
}
	
	public static void Running2() {
		int[] playerRandom = new int[5];
		String[] playerJump = { "", "", "", "", "" };
		boolean finish = false;
		int finishPlayer = 0;
	
		for (int i = 0; i < playerRandom.length; i++) {
			System.out.print(playerRandom[i]);
			System.out.println(i + 1 + "옷");

			if (playerJump[i].length() >= 50) {
				finishPlayer = i + 1;
				finish = true;
			}
		}
			
	}
	public static void Winner() {
		boolean finish = false;
		int finishPlayer = 0;
	
	if (finish) {
		System.out.println("우승자는 : " + finishPlayer);
		
	}
	
	}

	
	public static void main(String[] args) {
		
		while(true) {
			
		}
		

}
	
}
