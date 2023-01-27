package chapter16.generic2;

public class GenericPrinter<T extends Material> {
	
	T Material;
	

	
	public T getMaterial() {
		return Material;
	}

	public void setMaterial(T Material) {
		this.Material = Material;
	}
	
	@Override
	public String toString() {
		return Material.toString();
	}


}
