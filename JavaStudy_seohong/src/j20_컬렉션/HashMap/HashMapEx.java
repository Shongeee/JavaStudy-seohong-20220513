package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentsMap = new HashMap<Integer, String>();
		
		//값 추가
		studentsMap.put(20, "김준일");
		studentsMap.put(10, "김준이");
		studentsMap.put(22, "김준삼");
		studentsMap.put(33, "김준사");
		studentsMap.put(44, "김준오");
		
		System.out.println(studentsMap);

		//key 값으로 value 값 가져오기
		System.out.println(studentsMap.get(10));
		
		//값 수정
		studentsMap.put(10, "김준육"); // key 값이 없을 경우 추가가 됨.
		studentsMap.replace(10, "김준칠");
		
		System.out.println(studentsMap);
		
		//값 삭제
		studentsMap.remove(10);
		System.out.println(studentsMap);
		
		
		Iterator<Integer> iterator = studentsMap.keySet().iterator(); //keySet = key값을 set으로 변경
		while(iterator.hasNext()) {
			int key = iterator.next();
			String value = studentsMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentsMap.get(key));
//			}
			System.out.println(value);
		}
		
		
		//람다식(함수형 프로그래밍)
		studentsMap.forEach(
			(k, v) -> {
				System.out.println("key: " + k);
				System.out.println("value: " + v);
			}
		);
		
		System.out.println(studentsMap.containsKey(22));
		System.out.println(studentsMap.containsValue("김준구"));
		
	}

}
