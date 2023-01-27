package chapter12.Interface;

//상속 받아서 add/substract 구현(일부만 사용하므로 abstract)
public abstract class CompleteCal1 implements Calc{
//interface라서 implements로 받음.
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	
	  
	
	

}
