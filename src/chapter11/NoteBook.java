package chapter11;

public abstract class NoteBook extends Computer {
	//상속 받은 두 개의 추상 메서드 중 하나만 정의해서 사용할 경우 추상 클래스로 간주
	@Override
	public void display() {
		System.out.println("NoteBook");
		 
	
	}

}
