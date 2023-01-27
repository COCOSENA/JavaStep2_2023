package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("---------곰--------");
		var Bear=new Bear();
		Bear.getEye();
		Bear.getLeg();
		System.out.println("눈: "+Bear.getEye() + "다리:" + Bear.getLeg() + "특징 : " +Bear.woong);
		
		
		System.out.println("--------사자-------");
		var Lion=new Lion();
		Lion.getEye();
		Lion.getLeg();
		System.out.println("눈: "+Lion.getEye() + "다리:" + Lion.getLeg() + "특징 : " +Lion.galgi);
		
		
		System.out.println("--------거미-------");
		var Spider=new Spider();
		Spider.getEye();
		Lion.getLeg();
		System.out.println("눈: "+Spider.getEye() + "다리:" + Spider.getLeg() + "특징 : " +Spider.web);
		

	}

	
	
}
