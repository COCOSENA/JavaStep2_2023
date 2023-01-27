package chapter18.hashmap;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapTest1 {

	public static void main(String[] args) {
	
		Map<String, Integer> map = new HashMap<>(); //key , 값 
		
		map.put("김치", 85);
		map.put("홍길동", 90);
		map.put("박수", 98);
		map.put("동장군", 75);
		System.out.println("총 Entry 수 : " + map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : " +map.get("홍길동"));
		//객체 키 모두 받기
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		
		
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet(); //전부 다 끌고오는거

		
		Iterator<Map.Entry<String, Integer>>entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {  //★이터레이터 구조 
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+": " + value);
			
			
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
