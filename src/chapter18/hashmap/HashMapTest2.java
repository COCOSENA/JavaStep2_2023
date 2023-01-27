package chapter18.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		//Map 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		//팀원 데이터(성함, 학번)저장
		map.put("김창우", 11);
		map.put("김우태", 22);
		map.put("박수연", 33);
		map.put("백유기", 44);
		map.put("박범준", 55);
		
		//팀원의 인원
		
		System.out.println("팀원의 인원은 : " + map.size());
		//팀장의 학번 할아내자
		System.out.println("\t팀장의 이름과 학번 김창우 : " + map.get("김창우"));
		
		//팀원 모두의 학번 출력
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+ key + " : " + value);
		}
		

	}

}
