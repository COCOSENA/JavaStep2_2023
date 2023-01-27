package chapter16.generic2;

public class GenericPrinterMain2 {
	
	public static void main(String[] args) {
		//		GenericPrinter<Powder> p1 = new GenericPrinter<Powder>();
//		p1.setMaterial(new Powder());
//		System.out.println(p1.getMaterial());
//		
//		GenericPrinter<Plastic> p2 = new GenericPrinter<Plastic>();
//		p2.setMaterial(new Plastic());
//		System.out.println(p2.getMaterial());
		
		//수업중 
		GenericPrinter<Powder> printerPowder= new GenericPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder=printerPowder.getMaterial();
		System.out.println(powder);
		powder.doPrinting();
		
//		System.out.println();
//		//물의 재료는 허용되면 안 되지만 제네릭의 특성상 허용하는 모순 발생
//		Water water=new Water();
//		water.doPrinting();
//		
//		GenericPrinter<Water> printerWater= new GenericPrinter<Water>();
//		printerWater.setMaterial(new Water());
//		System.out.println(printerWater);
	
		
	}
}