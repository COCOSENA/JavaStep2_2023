package chapter08;

import chapter09.Paprica;

public class SuperMain {

	public static void main(String[] args) {
		
		Paprica obj=new Paprica();
		obj.Set1("피망류", "여름", "노랑파프리카"); //부모클래스의 생성자 사용
		obj.Set2("빨강", 7000 , "빨강파프리카");
		
		
		obj.Disp1();
		obj.Disp2();
		
		}

	}


