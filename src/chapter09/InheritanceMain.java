package chapter09;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Strawberry obj = new Strawberry();
		//s)값을 넣어줌 
		obj.Set1("Berry", "여름");
		obj.Set2("딸기", "중");
		obj.Set3("빨강", 7000);
		//s)출력
		obj.Disp1();
		obj.Disp2();
		obj.Disp3();

	}

}
