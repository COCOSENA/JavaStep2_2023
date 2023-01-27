package chapter12.Multiinterface;

public class InterMenuMain implements Inter_Menu3 {

	public static void main(String[] args) {
		InterMenuMain im=new InterMenuMain(); //부모는 메뉴3개, 차일드는 메인클래스 
		//부모 = 자식 
		Inter_Menu1 im1=im; //자식이 부모한테 가능 업캐스팅 ( 업캐스팅은 자연스럽게 됨 )
		Inter_Menu2 im2=im; //자식이 부모한테 가능 업캐스팅 
		Inter_Menu3 im3=im; //자식이 부모한테 가능 업캐스팅 
		System.out.println("========Inter_Menu1============");
		System.out.println(im1.jajang());
		im1.show();
		
		System.out.println("========Inter_Menu2============");
		System.out.println(im2.tangsuyuck());
		
		System.out.println("========Inter_Menu3============");
		System.out.println(im3.boggembab());
		

	}

	@Override
	public String jajang() {
		return "하나죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		return "해장하세요";
	}

	@Override
	public String tangsuyuck() {
		return "찹쌀 탕수육"; 
	}

	@Override
	public String boggembab() {
		return "해물볶음밥이 짱!";
	}

}
