package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		
		//어떤 위치의 문자 1개를 얻기
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//문자열 잘라내기 : 방법1
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);
		System.out.println(first);
		System.out.println(second);
		
		//문자열 잘라내기 : 방법2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//문자열 분리하기 : 방법3
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
		//포함 여부 : 방법1
		String content = "이것은 자바 책입니다.";
		boolean result = content.contains("자바"); //true
		System.out.println(result);
		
		//포함 여부 : 방법2
		int index = content.indexOf("자바");
		if(index != -1) {
			System.out.println("자바 관련 책이군요.");
		} else {
			System.out.println("자바 관련 책이 아니군요.");
		}
		
		//문자열의 길이
		int length = content.length();
		System.out.println(length);
		
		//대치하기
		String modifiedContent = content.replace("자바", "Java");
		System.out.println(modifiedContent);
	}

}
