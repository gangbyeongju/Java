package ch15.exam04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		//Map 생성
		Map<String, String> map = new HashMap<String, String>();
		
		//Entry 저장
		map.put("s1", "홍길동");
		map.put("s2", "감자바");
		map.put("s3", "개발자");
		System.out.println(map.size());
		
		//키의 값 가져오기
		String s1 = map.get("s1");
		System.out.println(s1);
		
		//반복 처리 방법1
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		//반복 처리 방법2
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		//삭제
		map.remove("s1");
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
	}

}
