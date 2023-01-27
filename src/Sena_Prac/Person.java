package Sena_Prac;

			
			public class Person {

			//멤버면수
			String name;
			boolean isMaRRIED;
			char havebaby;
			int age;
			

			//메소드 초기화 
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public boolean isMaRRIED() {
				return isMaRRIED;
			}
			public void setMaRRIED(boolean isMaRRIED) {
				this.isMaRRIED = isMaRRIED;
			}
			public char getHavebaby() {
				return havebaby;
			}
			public void setHavebaby(char havebaby) {
				this.havebaby = havebaby;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			
			
			
			
			public static void main(String[] args) {
				Person man=new Person();
				man.name = "James";
				man.age = 40;
				man.isMaRRIED = true;
				man.havebaby = 'y';
				
				System.out.println(man.name);
				System.out.println(man.age);
				System.out.println(man.isMaRRIED);
				System.out.println(man.havebaby);
				
				System.out.println("---------------------------");
				
				
				System.out.println("그 사람의 이름은 "+ man.getName());
				System.out.println("그 사람의 나이은 "+ man.getAge());
				System.out.println("그 사람은 아이가 있니? "+ man.getHavebaby());
				System.out.println("그 사람의 이름은 결혼했니?"+ man.isMaRRIED );
				
}
			}
			
