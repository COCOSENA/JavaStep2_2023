package chapter17.hashset;

import java.util.HashSet;

public class HashsetMain {

	public static void main(String[] args) {
		//equals와 hashcode가 오버라이딩 된 String Type
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정희"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍현의"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);
		hashSet.add(new String("강감찬"));

	}

}
