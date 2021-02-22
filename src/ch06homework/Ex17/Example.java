package ch06homework.Ex17;

public class Example {

	public static void main(String[] args) {
		
		Person p1 = new Person("123-123132","계백");
		
		System.out.println(p1.NATION);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.NATION = "usa";
		//p1.ssn = "515151-1515155"; final 필드는 값 수정 불가
		p1.name="을지문덕";
	}

}
